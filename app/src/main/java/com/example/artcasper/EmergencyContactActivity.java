package com.example.artcasper;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class EmergencyContactActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private static final int REQUEST_SMS = 2;
    private String phone_number, emergencyMessage;
    private CardView button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);
        showDialog();

        phone_number="9975188433";
        emergencyMessage="Help Me";
        button1=findViewById(R.id.card1);
        button2=findViewById(R.id.card2);
        button3=findViewById(R.id.card3);
        button4=findViewById(R.id.card4);
        button5=findViewById(R.id.card5);
        button6=findViewById(R.id.card6);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decision();
            }
        });


    }
    private void decision(){
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Make a call or message")
                .setMessage("What do you want to do?")
                .setPositiveButton("Phone Call",null)
                .setNeutralButton("Message",null)
                .show();
        Button phone_call = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        phone_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePhoneCall(phone_number);
            }
        });
        Button message = dialog.getButton(AlertDialog.BUTTON_NEUTRAL);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmergencyMessage(phone_number,emergencyMessage);
            }
        });
    }
    private void makePhoneCall(String pNum){
        if(pNum.trim().length()>0){
            if(ContextCompat.checkSelfPermission(EmergencyContactActivity.this,
                    Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(EmergencyContactActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }else{
                String dial = "tel:" + pNum;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall(phone_number);
            } else {
                Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
            }
        }else if(requestCode == REQUEST_SMS){
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                sendEmergencyMessage(phone_number,emergencyMessage);
            }else{
                Toast.makeText(this,"Permission denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void sendEmergencyMessage(String pNum, String msg){

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.SEND_SMS)==PackageManager.PERMISSION_GRANTED){
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(pNum.trim(), null, msg.trim(), null, null);
                    Toast.makeText(this, "Message is sent", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(this,"Failed to send the message",Toast.LENGTH_SHORT).show();
                }
            }else{
                requestPermissions(new String[]{Manifest.permission.SEND_SMS},REQUEST_SMS);
            }
        }
    }
    private void showDialog(){
        AlertDialog.Builder builder =
                new AlertDialog.Builder
                        (this);
        View view = LayoutInflater.from(this).inflate(
                R.layout.activity_dialog,
                (LinearLayout) findViewById(R.id.dialog_container)
        );
        builder.setView(view);
        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SOSelectionActivity.class);
                startActivity(intent);
            }
        });
//        if (alertDialog.getWindow() != null){
//            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(000000));
//        }
        alertDialog.show();
    }
}
