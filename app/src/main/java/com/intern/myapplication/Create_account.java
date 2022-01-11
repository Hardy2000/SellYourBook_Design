package com.intern.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Create_account extends AppCompatActivity {

    Button create_Account_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_account);
        getSupportActionBar().hide();
        create_Account_btn = findViewById(R.id.btn_create_account);
        create_Account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), Home_Container_Activity.class));
                Toast.makeText(Create_account.this, "Last Activity", Toast.LENGTH_SHORT).show();
                showDialog();
            }
        });
    }

    private void showDialog() {
        Dialog dialog = new Dialog(this, R.style.Link_Account_Dialog_Style);

        dialog.setContentView(R.layout.link_account_dialogbox);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        Button button = dialog.findViewById(R.id.btn_Continue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Home_Container_Activity.class));
               // dialog.dismiss();
                finish();

            }
        });
        dialog.show();

    }
}