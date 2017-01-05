# Dicoding_Lesson1

### Pengenalan Activity

Activity adalah Komponen android yang menyediakan tampilan didalam sebuah aplikasi dimana pengguna akan berinteraksi dengannya.

![](https://github.com/Danboru/Dicoding_Lesson1/blob/master/images/Lesson1.gif?raw=true)


#### Penggunaan TextUtils untuk mengetahui apakah sebuah EditText mendapatkan inputan dari user atau tidak.


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
