package com.example.pesanmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DaftarPesanan extends AppCompatActivity {

    private TextView text, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesanan);

        text = findViewById(R.id.pesanan);
        total = findViewById(R.id.total);

        Intent intent = getIntent();
        String sum = intent.getStringExtra("Pesanan");
        int tot = intent.getIntExtra("Bayar", 0);

        text.setText(sum);
        total.setText("Rp. " + tot);

    }
}