package com.ikbal.pemesananmimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView etUser,etPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.et_user);
        etPass = findViewById(R.id.et_pass);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etUser.getText().toString().equals("admin") && etPass.getText().toString().equals("admin")){
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(intent);
                }
                else if (etUser.getText().toString().equals("") && etPass.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "USERNAME dan PASSWORD tidak boleh KOSONG!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Nama atau Password SALAH !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}