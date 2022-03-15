package com.example.artcasper;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ComplaintReportActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        showDialog();
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
