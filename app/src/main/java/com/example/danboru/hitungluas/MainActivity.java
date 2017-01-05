package com.example.danboru.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText panjang, lebar;
    Button hitung;
    TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText view

        panjang = (EditText) findViewById(R.id.edt_panjang);
        lebar = (EditText) findViewById(R.id.edt_lebar);

        //Button View

        hitung = (Button) findViewById(R.id.btn_hitung);

        //Text View

        hasilnya = (TextView) findViewById(R.id.txt_tampildata);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String panjangnya = panjang.getText().toString().trim();
                String lebarnya = lebar.getText().toString().trim();

                if(TextUtils.isEmpty(panjang.getText()) || TextUtils.isEmpty(lebar.getText())){

                    //Keadaan ketika salah satu editText tidak menerima inputan

                    Log.d("Hitung", "Tidak ada data yang di inputkan");
                    Toast.makeText(MainActivity.this,"Nilai yang dimasukkan tidak boleh kosong",Toast.LENGTH_SHORT).show();

                } else {

                    double p, l, hasil;

                    p = Double.parseDouble(panjangnya);//input panjang
                    l = Double.parseDouble(lebarnya);//input lebar

                    try{

                        hasil = p * l;//proses aritmatika

                        Log.d("Hitung", "Data Berhasil Di Hitung");
                        hasilnya.setText(String.valueOf(hasil));

                    }catch (ArithmeticException e){

                        //penanganan kesalahan dalam aritmaka
                        Log.d("Perhitungan", "Terjjadi Kesalahan -- " + e.getMessage()  );

                    }

                }

            }
        });

    }



}
