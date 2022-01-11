package com.intern.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Otp_Activity extends AppCompatActivity {

    EditText ot1, ot2, ot3, ot4;
    String otpText="";
    Button verifyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_);
        getSupportActionBar().hide();
        ot1 = findViewById(R.id.ot1);
        ot2 = findViewById(R.id.ot2);
        ot3 = findViewById(R.id.ot3);
        ot4 = findViewById(R.id.ot4);
verifyButton=findViewById(R.id.btn_otp_verify);


        ot1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (ot1.getText().toString().trim().length() == 1) {
                    ot1.clearFocus();
                    ot2.requestFocus();
                    ot2.setCursorVisible(true);
                }
            }
        });

        ot2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (ot2.getText().toString().trim().length() == 1) {
                    ot2.clearFocus();
                    ot3.requestFocus();
                    ot3.setCursorVisible(true);
                }

            }
        });

        ot3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (ot3.getText().toString().trim().length() == 1) {
                    ot3.clearFocus();
                    ot4.requestFocus();
                    ot4.setCursorVisible(true);
                }

            }
        });

    ot4.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (ot4.getText().toString().trim().length() == 1) {
ot4.clearFocus();
                   }

        }
    });

    verifyButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           // otpText=ot1.getText().toString().trim()+ot2.getText().toString().trim()+ot3.getText().toString().trim()+ot4.getText().toString().trim();
            //Toast.makeText(Otp_Activity.this, otpText, Toast.LENGTH_LONG).show();
        Intent intent=new Intent(Otp_Activity.this,Create_account.class);
        startActivity(intent);
        }
    });

    }


}