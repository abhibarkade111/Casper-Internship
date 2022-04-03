package com.example.artcasper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Rewards_Scratch extends AppCompatActivity {

    ImageView l1,l2;
    Button btn;
    TextView tv;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards_scratch);

        tv=findViewById(R.id.text);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("", tv.getText());
                clipboard.setPrimaryClip(clip);
                Toast.makeText(Rewards_Scratch.this, "Discount Coupon Copied", Toast.LENGTH_SHORT).show();
            }
        });
        l1=findViewById(R.id.l1);
        //btn=findViewById(R.id.btn);
        l2=findViewById(R.id.dominos);
        /*l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List_Dialog l=new List_Dialog();
                l.show(getSupportFragmentManager(),"List Dialog");
            }
        });
*/
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://pizzaonline.dominos.co.in/"));
                startActivity(i);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.oyorooms.com/"));
                startActivity(i);
            }
        });
    }
}