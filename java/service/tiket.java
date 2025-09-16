/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.kereta;
import model.penumpang;

public class tiket {
    private ArrayList<penumpang> daftarPenumpang = new ArrayList<>();
    private ArrayList<kereta> daftarKereta = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public tiket(){
        daftarKereta.add(new kereta(101, "Argo Wilis", "Bandung", "07:00", 300, 250000));
        daftarKereta.add(new kereta(102, "Taksaka", "Jakarta", "08:30", 350, 300000));
        daftarKereta.add(new kereta(103, "Prameks", "Solo", "18:00", 400, 100000));
        
        daftarPenumpang.add(new penumpang("Hafizh", 101, "Bandung", "07:00", "082211423123",  250000));
        daftarPenumpang.add(new penumpang("Rama", 103, " Solo", "18:00", "082131231313", 100000));
    }
    
    public void tampilKereta() {
        System.out.println("\n========  Stasiun Yogyakarta ========");   
        System.out.println("\n==========  jadwal Kereta  ==========");
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
    public void tampilPenumpang() {
        if(daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket yakk brokk!");
            return;
        } else {
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
    
    public void tambahTiket() {
            tampilKereta();
            System.out.println("\n========   Tambahan Tiket   ==========");
            System.out.print("Masukkan nama penumpang: ");
            String namaPenumpang = scanner.nextLine();
                if(namaPenumpang.isEmpty()){
                    System.out.println("Diharapkan mengisi nama dengan benar!");
                    return;
                      }
                
            System.out.print("Masukkan nomor kereta: "); 
            int nomorKereta = scanner.nextInt();
            scanner.nextLine();
                 kereta tiketKereta = null;
                 for (kereta krt : daftarKereta) {
                    if (krt.nomorKereta == nomorKereta){
                        tiketKereta = krt;
                    }
                 }
                if(tiketKereta == null){
                    System.out.println("Nomor Kereta tidak ada mi! Diharapkan perhatikan ulang!");
                    return;
                     }
                
            System.out.print("Masukkan Nomor Handphone: ");
            String nomorHp = scanner.nextLine();

            System.out.println("Tujuan: " + tiketKereta.tujuan);
            System.out.println("Waktu: " + tiketKereta.waktuBerangkat);
            System.out.println("Harga: Rp" + tiketKereta.hargaKereta);
                    
            penumpang pesan = new penumpang(namaPenumpang, nomorKereta, tiketKereta.tujuan, tiketKereta.waktuBerangkat, nomorHp, tiketKereta.hargaKereta);

            daftarPenumpang.add(pesan);

            System.out.println("Pesan Kereta berhasil ditambahkan yeyy masborrr!");
        }
    
    
        public void updateTiket(){  
        System.out.println("\n===========  Update Tiket  ==========");
        if (daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket masbro!"); 
         } else {
            tampilPenumpang();
            System.out.print("Masukkan nomor tiket yang ingin diperbarui: ");
            int update = scanner.nextInt();
            scanner.nextLine(); 

            if (update > 0 && update <= daftarPenumpang.size()) {
            penumpang baru = daftarPenumpang.get(update - 1);

            System.out.print("Nama Penumpang Baru : ");
            String namaBaru = scanner.nextLine();        
            if (!namaBaru.isEmpty()) {                   
                baru.namaPenumpang = namaBaru;           
            }

            System.out.print("Nomor Kereta Baru   : ");
            String inputNomor = scanner.nextLine();
            
            if (!inputNomor.isEmpty()) {
                baru.nomorKereta = Integer.parseInt(inputNomor);
            }

            System.out.print("Tujuan Baru: ");
            String inputTujuan = scanner.nextLine();
            if (!inputTujuan.isEmpty()) {
                baru.tujuan = inputTujuan;
            }

            System.out.print("Waktu Berangkat Baru: ");
            String inputWaktu = scanner.nextLine();
            if (!inputWaktu.isEmpty()) {
                baru.waktuBerangkat = inputWaktu;
            }

            System.out.print("Nomor HP Baru       : ");
            String inputHp = scanner.nextLine();
            if (!inputHp.isEmpty()) {
                baru.nomorHp = inputHp;
            }

            System.out.print("Harga Kereta Baru   : ");
            String inputHarga = scanner.nextLine();
            if (!inputHarga.isEmpty()) {
                baru.hargaKereta = Integer.parseInt(inputHarga);
            }


            System.out.println("Tiket berhasil diperbarui yeyyyyyy!");
        } else {
            System.out.println("Nomor tiket tidak va va va validdd!");
            }
        }
    }
        
        public void hapusTiket(){
            System.out.println("\n===========  Hapus Tiket  ==========");
            if (daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket masbro!");
        } else {
            tampilPenumpang();
            System.out.print("Masukkan nomor tiket yang ingin dihapus: ");
            int hapus = scanner.nextInt();
            scanner.nextLine(); // 
            
            if (hapus > 0 && hapus <= daftarPenumpang.size()) {
                penumpang dihapus = daftarPenumpang.remove(hapus - 1);
                System.out.println("==== Tiket kereta \"" + dihapus.namaPenumpang + "\" berhasil dihapus ====");
            } else {
                    System.out.println("Nomor tiket tidak valid");
                    }
            }
        }

        
        public void cariKereta(){
           System.out.println("\n===========  Cari Jadwal Kereta  ==========");
           
           System.out.print("Masukkan nomor kereta: "); 
            int nomorKereta = scanner.nextInt();
            scanner.nextLine();
                for (kereta krt : daftarKereta) {
                    if (krt.nomorKereta == nomorKereta) {
                        System.out.println("\n========  Stasiun Yogyakarta ========");   
                        System.out.println("\n==========  jadwal Kereta  ==========");
                        System.out.println("Nomor Kereta    : " + krt.nomorKereta);
                        System.out.println("Nama Kereta     : " + krt.namaKereta);
                        System.out.println("Tujuan          : " + krt.tujuan);
                        System.out.println("Waktu Berangkat : " + krt.waktuBerangkat);
                        System.out.println("Kapasitas       : " + krt.kapasitas);
                        System.out.println("Harga Kereta    : " + krt.hargaKereta);
                        System.out.println("==================================");
                        return;
                        }
                    }
                System.out.println("Nomor kereta tidak ditemukan dalam daftarKereta! Diperhatikan Brok dengan baik-baik");
                }
            }
        

        

            



    
   

