package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText name, email;
    Button signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.signUpName);
        email = findViewById(R.id.emailEt);
        signUpButton  =findViewById(R.id.signUpBtn);
        SharedPreferences preferences = getSharedPreferences("ART",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = name.getText().toString();
                String UserEmail = email.getText().toString();
                editor.putString("UserName", UserName);
                editor.putString("UserEmail",UserEmail);
                editor.apply();
                startActivity(new Intent(Register.this, MainActivity2.class));

            }
        });
    }
}