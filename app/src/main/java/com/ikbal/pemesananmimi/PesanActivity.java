package com.ikbal.pemesananmimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class PesanActivity extends AppCompatActivity {

    EditText etPesan;
    ImageView imgPesan;
    Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        imgPesan = findViewById(R.id.img_psn);
        Bundle bundle = getIntent().getExtras();
        int Foto = bundle.getInt("foto");
        imgPesan.setImageResource(Foto);

        etPesan = findViewById(R.id.et_pesan);
        btnPesan = findViewById(R.id.btn_pesan);

        Integer Harga = getIntent().getIntExtra("harga", 0);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PesanActivity.this, CheckoutActivity.class);
                intent.putExtra("jumlah", etPesan.getText().toString());
                intent.putExtra("harga", Harga);
                intent.putExtra("total", Integer.parseInt(etPesan.getText().toString()) * Harga);
                startActivity(intent);
            }
        });

    }
}