# Dicoding_Lesson1

### Pengenalan Activity

* AndroidManifest.xml dan Gradle (Module app)

  * File yang akan mengontrol semua komponen, level SDK dan permission yang ada di aplikasi
  * File yang akan mengontrol semua dependency library yang digunakan oleh Aplikasi

* Activity

  * Activity adalah Komponen android yang menyediakan tampilan didalam sebuah aplikasi dimana pengguna akan berinteraksi dengannya.   *     Misal layar list chat pada aplikasi whatsapp android, user timeline yang ada di aplikasi twitter dan facebook anda, layar inbox pada     aplikasi gmail anda dan lain sebagainya.
  * Setiap class Java dinyatakan sebagai sebuah Activity jika class tersebut meng-extends pada class Activity
  * Activity umumnya memiliki sebuah tampilan dalam format layout .xml
  * Activity memiliki lifecycle di memory dimana para developer android harus peduli dan tau kapan sebuah Activity diciptakan (create) hingga dimatikan (destroy) dari memory
  * Setiap Activity yang dimiliki dan akan digunakan di aplikasi harus di registrasikan di file AndroidManifest.xml
  * Activity menganut konsep Stack : Last in First Out (LIFO) yang mana setiap activity yang terakhir diciptakan atau ditampilkan dilayar akan keluar pertama kali dari stack jika Pengguna menekan tombol:
    * Physical back button, atau
    * Back button pada Action Bar Aplikasi
    

## Demo Apps

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
