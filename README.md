# PraktikumPBO-2025

Hendri Zaidan Safitra

2409116013

A'2024

===========================================================================
## Penjelasan Singkat Program Sistem Transportasi Kereta

Sistem Transportasi Kereta adalah program java yang dirancang untuk memesan dan mengelola tiket kereta para pengguna. Dengan adanya program ini memungkinkan pengguna dapat melihat, menambah, memperbaruhi dan menghapus tiket menjadi lebih terstruktur, lebih mudah digunakan dan efesien.

===========================================================================
## Penjelasan Alur Program

1. Struktur Package

   <img width="401" height="213" alt="image" src="https://github.com/user-attachments/assets/df533adc-fed7-4b67-8f77-3ce1d4b6efd6" />


   Ada empat package di folder source package yaitu package model, package main, package service dan view.
   
   a). Model berisi class yang menyatakan data atau entitas dalam program, ada dua class yaitu
   kereta.java untuk menyatakan objek kereta misalnya nama, nomor kereta dan lain sebagainya.dan    penumpang.java untuk menyatakan objek penumpang misalnya nama, nomor handphone dan lain          sebagainya. Oleh karena itu package model sesuai dengan MVC (Model-view-controller) yaitu         model karena menyimpan data dan struktur objek pada dua class yaitu Kereta dan penumpang.

   b). Main berisi class utama atau entry point program berfungsi sebagai tempat program yang       dijalankan, mengatur interaksi pengguna dan bisa memanggil fungsi dari package lain.

   c). Service berisi class yang mengatur logika program atau bisa dibilang jembatan antara model
   dan main karena bisa mengatur mekanisme logika terkait class tiket di package service. Oleh      karena itu package main dan service sesuai dengan MVC (Model-view-controller) yaitu              controller karena mengatur mekanisme logika dan alur utama suatu program.

   d). View berisi class output pada daftar kereta dan daftar penumpang sesuai dengan MVC           (Model - view - controller).

2. Alur Program
   
<img width="492" height="235" alt="image" src="https://github.com/user-attachments/assets/a9bdfd96-fe20-45f1-8f67-4c4395b4188b" />

Saat pertama kali program dijalankan, pengguna diminta memilih pada menu yang tersedia, ada menu tambah tiket, Informasi tiket, update tiket, hapus tiket, cari kereta dan keluar menggunakan angka 1-6 sesuai nama menu yang tersedia.

<img width="394" height="596" alt="image" src="https://github.com/user-attachments/assets/54900ae3-7b56-4b63-af9e-055cf0323716" />

Jika pengguna memilih "1" maka pengguna masuk ke menu "Tambah Tiket" maka daftar kereta yang tersedia akan tampil sebelum user memesan tiket/ menambahkan tiket, bisa diliat ada 3 daftar kereta yang tersedia. Selanjutnya pengguna memilih yang mana kereta yang tujuan nya sama dengan pengguna, setelah memilih pengguna di minta untuk isi nama, nomor kereta yang ingin dipesan, dan nomor handphone dan pesan tiket atas nama "Gerald" telah berhasil ditambahkan dan menampilkan isi dari nomor kereta yang dipilihnya dan tiket tersebut masuk kedalam list informasi tiket.

<img width="407" height="503" alt="image" src="https://github.com/user-attachments/assets/7dfd2130-af1c-4c20-8a85-d4aa3aa9918a" />

Jika pengguna menginput nomor kereta yang tidak sesuai dengan daftar kereta yang ada maka outputnya nomor kereta tidak ada dan kembali ke menu awal.

<img width="373" height="576" alt="image" src="https://github.com/user-attachments/assets/8760b68d-32cb-44ca-83c0-8dff98cc1592" />

Jika sudah pesan pengguna mau melihat informasi tiketnya maka pengguna memilih "2" dan masuk ke menu "Informasi Tiket". Diliat daftar informasi tiket kereta nya dan tiket orang lain yang memilih kereta yang sama. dan bisa melihat informasi tiket walaupun belum pesan tiket.

<img width="477" height="605" alt="image" src="https://github.com/user-attachments/assets/4e04de95-2486-46da-9e19-d4f82747b760" />

Jika pengguna mau update tiketnya maka pengguna memilih "3" dan masuk ke menu "Update Tiket". Ketika masuk akan ditampilkan daftar pengguna nya dan pengguna lain, jika pengguna mau mengupdate keretanya maka harus menginput nomor tiket misal nomor tiket "3" maka mengupdate isi tiket tersebut, diliat pengguna mengupdate nomor kereta, tujuan, waktu berangkat, dan harga kereta. kenapa di kosongkan nama nya dan nomornya karena pengguna tidak mau ngubah namanya dan nomornya maka programnya membaca namanya tetap sama walaupun di kosongan. setelah itu update tiket tersebut masuk ke list informasi tiket.

<img width="366" height="513" alt="image" src="https://github.com/user-attachments/assets/e30520de-96aa-4f64-942d-4e45f21b534e" />

Jika pengguna menginput nomor tiket yang tidak ada dalam daftar penumpang yang ada maka outputnya nomor tiket tidak ada dan kembali ke menu awal.

<img width="407" height="643" alt="image" src="https://github.com/user-attachments/assets/42e1ceda-f98c-4e3a-8a0d-4482e579be79" />

Jika pengguna mengbatalkan tiketnya maka pengguna memilih "4" dan masuk ke menu "Hapus Tiket". Ketika masuk akan ditampilkan daftar pengguna nya dan yang lain, Jika pengguna mau membatalkan tiketnya maka harus menginput nomor tiket yang ingin dihapus misal nomor tiket "3". maka outputnya Tiket kereta "Gerald" berhasil dihapus dan tidak bisa kembali. Setelah itu tiket yang dihapus itu akan hilang di list informasi tiket.

<img width="363" height="536" alt="image" src="https://github.com/user-attachments/assets/24c581ad-dd10-4b08-9b93-1453c2c9628b" />

Sebelum dihapus

<img width="327" height="430" alt="image" src="https://github.com/user-attachments/assets/2f92e4d2-9285-4fb3-9784-ce5b587e13ba" />

Setelah dihapus

<img width="328" height="520" alt="image" src="https://github.com/user-attachments/assets/5156d4fe-400f-4577-9f82-d0fbb77c3192" />

Jika pengguna menginput nomor tiket yang tidak ada dalam daftar penumpang yang ada maka outputnya nomor tiket tidak valid dan tidak ada dihapus dan kembali ke menu awal.

<img width="343" height="415" alt="image" src="https://github.com/user-attachments/assets/6b5321cf-ea9d-4c74-8ef9-c828fd08443e" />

Jika pengguna mencari tahu kereta maka pengguna memilih "5" dan masuk ke menu "Cari Kereta".
Ketika masuk akan diminta menginput nomor kereta yang ingin dicari misal nomor kereta "101", maka outputnya akan menampilkan informasi pada kereta yang ingin di cari. Bisa dilihat pada gambar di atas informasi kereta yang diberikan lengkap untuk pengguna.

<img width="492" height="285" alt="image" src="https://github.com/user-attachments/assets/8628b7e0-a1fc-4f81-ac46-c8da0d55e259" />

Jika pengguna menginput nomor kereta yang tidak ada didalam daftar kereta maka outputnya nomor kereta tidak ditemukan dan kembali ke menu awal.

<img width="534" height="308" alt="image" src="https://github.com/user-attachments/assets/f35f9e4a-e022-45a1-9127-157a79323526" />

Jika pengguna merasa cukup untuk menggunakan program ini, maka pengguna memilih "6" untuk keluar program.

<img width="352" height="201" alt="image" src="https://github.com/user-attachments/assets/0f66c669-f0a9-4c1a-a9ab-e13c76ed1334" />

Jika pengguna menginput selain 1-6 maka outputnya pilihan tidak valid dan kembali ke menu awal.

===========================================================================
