package com.example.artcasper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().hide();
        final EditText mobileN = findViewById(R.id.signUpMobileNumber);
        final AppCompatButton continueButton = findViewById(R.id.signUpContinue);
        final TextView signInButton  = findViewById(R.id.SignUpSignInButton);
        final ImageView back_arrow = findViewById(R.id.sign_in_back);
        final ProgressBar progressBar = findViewById(R.id.signUpProgressbar);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String mobile = mobileN.getText().toString().trim();
                if(mobile.length()==10){

                    progressBar.setVisibility(View.VISIBLE);
                    continueButton.setVisibility(View.INVISIBLE);

                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            "+91" + mobile,
                            60,
                            TimeUnit.SECONDS,
                            SignInActivity.this,
                            new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                @Override
                                public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                    progressBar.setVisibility(View.GONE);
                                    continueButton.setVisibility(View.VISIBLE);
//                                    Toast.makeText(SignUpMobile.this, "On Complete Listener", Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onVerificationFailed(@NonNull FirebaseException e) {
                                    progressBar.setVisibility(View.GONE);
                                    continueButton.setVisibility(View.VISIBLE);
                                    Toast.makeText(SignInActivity.this,  e.getMessage(), Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                    progressBar.setVisibility(View.GONE);
                                    continueButton.setVisibility(View.VISIBLE);
                                    Toast.makeText(SignInActivity.this, "OTP sent successfully", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), OTPVerification.class);
                                    intent.putExtra("mobileSignUp", mobile);
                                    intent.putExtra("backendOtp", s);
                                    startActivity(intent);
                                }
                            }
                    );


//                    Intent intent = new Intent(SignUpMobile.this, OTPVerification.class);
//                    intent.putExtra("mobileSignUp", mobile);
//                    startActivity(intent);
                }
                else{
                    Toast.makeText(SignInActivity.this, "Enter Valid Mobile Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}