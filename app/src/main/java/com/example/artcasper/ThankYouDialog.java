package com.example.artcasper;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatDialogFragment;

    public class ThankYouDialog extends AppCompatDialogFragment {
        Button close;
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
            LayoutInflater layoutInflater = getActivity().getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.thank_you_dialog, null);
            builder.setView(view);
            close = view.findViewById(R.id.close_btn);
            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ThankYouDialog.this.getActivity().finish();
                }
            });
            return builder.create();


        }
    }

