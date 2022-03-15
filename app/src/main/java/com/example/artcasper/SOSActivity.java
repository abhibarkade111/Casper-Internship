package com.example.artcasper;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SOSActivity extends AppCompatActivity {
    private static final int REQUEST_SMS = 1;
    private String phone_number, emergencyMessage;
    Button sosbutton;
    TextInputEditText sostext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_sos);
        phone_number="9975188433";
        sosbutton=findViewById(R.id.elevatedButton);
        sostext=findViewById(R.id.sos_text);
        emergencyMessage= sostext.getText().toString();
        sosbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmergencyMessage(phone_number,emergencyMessage);
            }
        });
    }
    private void sendEmergencyMessage(String pNum, String msg){

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){
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
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == REQUEST_SMS){
            if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                sendEmergencyMessage(phone_number,emergencyMessage);
            }else{
                Toast.makeText(this,"Permission denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
