## TUGAS KELOMPOK - PBO

Anggota Kelompok :

- Ruth Septriana Sipangkar (24060124120024)
- Sarifa Nuha Ardanti Jusmar (24060124130082)
- Syafira Azka Ramadhani (24060124130088)
- Yasmina Syahidah (24060124130116)

Informatika 2024 Kelas C

## Bussines Process

Sebuah **Sistem Geometrik** terdiri dari dua class utama, yaitu BangunDatar dan BangunRuang, dengan rincian sebagai berikut.

**BangunDatar** adalah abstract class yang memiliki atribut jumlahSisi dan warna, serta atribut statis counterBangunDatar. BangunDatar memiliki abstract method untuk menghitung keliling, menghitung luas, dan menampilkan detail.

BangunDatar membentuk tiga subclass: 
- BujurSangkar, yang memiliki ukuran sisi dalam cm dan method untuk menghitung diagonal;
- PersegiPanjang, yang memiliki panjang dan lebar dalam cm;
- SegiTiga, yang memiliki alas dan tinggi dalam cm.

**BangunRuang** adalah abstract class yang memiliki atribut jumlahSisi, jumlahRusuk, dan volumeAir, serta atribut statis counterBangunRuang. BangunRuang memiliki abstract method untuk menghitung luas permukaan, menghitung volume, dan menampilkan detail.

BangunRuang membentuk tiga subclass:
- Kubus, yang tersusun dari sisi berbentuk BujurSangkar dan memiliki method untuk menghitung diagonal ruang; 
- Balok, yang tersusun dari sisiAlas dan sisiTegak berbentuk PersegiPanjang dan memiliki method untuk menghitung diagonal ruang;
- Prisma, dengan sisiAlas berbentuk SegiTiga dan sisiTegak berbentuk PersegiPanjang.

Selain itu, terdapat interface kepada BangunRuang yang berfungsi menampung air di dalamnya, dengan method isiPenuh, kosongkan, serta isiAir dan kurangiAir yang dengan dan tanpa parameter (default 10mL).

Dengan struktur ini, seluruh sistem geometrik tersusun secara terorganisir, di mana setiap jenis bangun datar maupun bangun ruang memiliki karakteristik dan perilaku yang konsisten dengan sifat geometrisnya.

## Class Diagram

<p align="center">
  <img src="./img/PBO-class-diagram.png" width="700">
</p>