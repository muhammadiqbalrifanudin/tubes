package com.ikbal.pemesananmimi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class RokokFragment extends Fragment {

    LinearLayout Rokok1,Rokok2,Rokok3,Rokok4,Rokok5;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_roko, container, false);

        Rokok1 = view.findViewById(R.id.rokok1);
        Rokok2 = view.findViewById(R.id.rokok2);
        Rokok3 = view.findViewById(R.id.rokok3);
        Rokok4 = view.findViewById(R.id.rokok4);
        Rokok5 = view.findViewById(R.id.rokok5);

        Rokok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                    intent.putExtra("foto", R.drawable.surya);
                    intent.putExtra("nama", "Surya");
                    intent.putExtra("harga", 13000);
                startActivity(intent);
            }
        });
        Rokok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.samp);
                intent.putExtra("nama", "Sampoerna");
                intent.putExtra("harga", 24000);
                startActivity(intent);
            }
        });
        Rokok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.scorp);
                intent.putExtra("nama", "Scorpion");
                intent.putExtra("harga", 17000);
                startActivity(intent);
            }
        });
        Rokok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.cl);
                intent.putExtra("nama", "Class Mild");
                intent.putExtra("harga", 24000);
                startActivity(intent);
            }
        });
        Rokok5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.ese);
                intent.putExtra("nama", "Esse");
                intent.putExtra("harga", 25000);
                startActivity(intent);
            }
        });

        return view;
    }
}