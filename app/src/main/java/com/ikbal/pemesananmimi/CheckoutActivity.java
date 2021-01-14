package com.ikbal.pemesananmimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    TextView txJumlah,txHarga,txTotal;
    Button btnTunai,btnNonTunai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        txJumlah = findViewById(R.id.tx_jumlah);
        txHarga = findViewById(R.id.tx_harga);
        txTotal = findViewById(R.id.tx_total);

        txJumlah.setText(getIntent().getStringExtra("jumlah"));

        Integer harga = getIntent().getIntExtra("harga", 0);
        String valueHarga = harga.toString();
        txHarga.setText("Rp. " + valueHarga);

        Integer hargaTotal = getIntent().getIntExtra("total",0);
        String valueTotal = hargaTotal.toString();
        txTotal.setText("Rp. " + valueTotal);

        btnTunai = findViewById(R.id.btn_tunai);
        btnNonTunai = findViewById(R.id.btn_nontunai);

        btnTunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckoutActivity.this, TunaiActivity.class);
                startActivity(intent);
            }
        });

        btnNonTunai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckoutActivity.this, NonTunaiActivity.class);
                startActivity(intent);
            }
        });
    }
}