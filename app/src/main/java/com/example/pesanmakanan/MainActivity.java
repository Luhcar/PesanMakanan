package com.example.pesanmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView jml, jml1, jml2, harga, harga1, harga2, totharga, totitem;
    private Button btntambah, btnkurang, btntambah1, btnkurang1, btntambah2, btnkurang2, btnriwayat, btnbayar;
    int item, item1, item2, priceView, priceView1, priceView2;
    String setnewPrice, setnewPrice1, setnewPrice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jml = findViewById(R.id.jumlah);
        jml1 = findViewById(R.id.jumlah1);
        jml2= findViewById(R.id.jumlah2);

        harga = findViewById(R.id.harga);
        harga1 = findViewById(R.id.harga1);
        harga2 = findViewById(R.id.harga2);
        totharga = findViewById(R.id.totharga);
        totitem = findViewById(R.id.totitem);

        btntambah = findViewById(R.id.btntambah);
        btntambah1 = findViewById(R.id.btntambah1);
        btntambah2 = findViewById(R.id.btntambah2);

        btnkurang = findViewById(R.id.btnkurang);
        btnkurang1 = findViewById(R.id.btnkurang1);
        btnkurang2 = findViewById(R.id.btnkurang2);
        btnriwayat = findViewById(R.id.btnriwayat);
        btnbayar = findViewById(R.id.btnbayar);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 22500;
                item++;
                tampilHarga();
                 priceView = basePrice * item;
                //String setnewPrice = String.valueOf(priceView);
                //harga.setText(setnewPrice);
                totalHarga();
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 22500;
                if (item == 0){
                } else {
                    item--;
                    tampilHarga();
                    priceView = basePrice * item;
                    //setnewPrice = String.valueOf(priceView);
                    //harga.setText(setnewPrice);
                    totalHarga();
                }
            }
        });
        btntambah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 30000;
                item1++;
                tampilHarga();
                priceView1 = basePrice * item1;
                //setnewPrice = String.valueOf(priceView);
                //harga1.setText(setnewPrice);
                totalHarga();
            }
        });
        btnkurang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 30000;
                if (item1 == 0){
                } else {
                    item1--;
                    tampilHarga();
                    priceView1 = basePrice * item1;
                    //String setnewPrice = String.valueOf(priceView);
                    //harga1.setText(setnewPrice);
                    totalHarga();
                }
            }
        });
        btntambah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 27500;
                item2++;
                tampilHarga();
                 priceView2 = basePrice * item2;
                //setnewPrice2 = String.valueOf(priceView);
                // harga2.setText(setnewPrice);
                totalHarga();
            }
        });
        btnkurang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int basePrice = 27500;
                if (item2 == 0){
                } else {
                    item2--;
                    tampilHarga();
                     priceView2 = basePrice * item2;
                    //setnewPrice2 = String.valueOf(priceView);
                    // harga2.setText(setnewPrice);
                    totalHarga();
                }
            }
        });

        btnbayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (item==0 & item1==0 & item2==0){
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Makanan", Toast.LENGTH_SHORT).show();
                } else {
                    String text = "";
                    int total = 0;
                    if (item>0){
                        String makanan = "Rendang";
                        text = item + "\t" + makanan + "\t\t\t\t\t" + priceView;
                        total = total + priceView;
                    }
                    if (item1>0){
                        String makanan = "Cumi Bakar";
                        text = item1 + "\t" + makanan + "\t\t\t\t\t" + priceView1;
                        total = total + priceView1;
                    }
                    if (item2>0){
                        String makanan = "Udang Bakar";
                        text = item2 + "\t" + makanan + "\t\t\t\t\t" + priceView2;
                        total = total + priceView2;
                    }
                }
            }
        });
    }
    private void tampilHarga() {
        totitem.setText(String.valueOf(item+item1+item2+" Item"));
        jml.setText(String.valueOf(item));
        jml1.setText(String.valueOf(item1));
        jml2.setText(String.valueOf(item2));
    }

    private void totalHarga() {
        totharga.setText(String.valueOf(priceView+priceView1+priceView2));
        harga.setText(String.valueOf(priceView));
        harga1.setText(String.valueOf(priceView1));
        harga2.setText(String.valueOf(priceView2));
    }
}
