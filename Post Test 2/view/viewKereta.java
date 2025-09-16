/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.kereta;
import model.penumpang;

public class viewKereta {
    
    public void tampilKereta(ArrayList<kereta> daftarKereta) {
        System.out.println("\n========  Stasiun Yogyakarta ========");
        System.out.println("\n==========  Jadwal Kereta  ==========");
        for (kereta krt : daftarKereta) {
            System.out.println("Nomor Kereta    : " + krt.nomorKereta);
            System.out.println("Nama Kereta     : " + krt.namaKereta);
            System.out.println("Tujuan          : " + krt.tujuan);
            System.out.println("Waktu Berangkat : " + krt.waktuBerangkat);
            System.out.println("Kapasitas       : " + krt.kapasitas);
            System.out.println("Harga Kereta    : " + krt.hargaKereta);
            System.out.println("==================================");
        }
    }

    public void tampilPenumpang(ArrayList<penumpang> daftarPenumpang) {
        if(daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket yakk brokk!");
            return;
        }
        int index = 1;
        for (penumpang png : daftarPenumpang) {
            System.out.println("Nomor Tiket    : " + index);
            System.out.println("Nama Penumpang : " + png.namaPenumpang);
            System.out.println("Nomor Kereta   : " + png.nomorKereta);
            System.out.println("Tujuan         : " + png.tujuan);
            System.out.println("Waktu Berangkat: " + png.waktuBerangkat);
            System.out.println("Nomor Handphone: " + png.nomorHp);
            System.out.println("Harga Kereta   : " + png.hargaKereta);
            System.out.println("==================================");
            index++;
        }
    }
}

