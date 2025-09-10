/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktium;
import java.util.ArrayList;
import java.util.Scanner;

public class kereta {
    
    public String namaKereta, rute, waktuBerangkat, namaPenumpang, nomorHp;
    public int nomorKereta, hargaKereta;
    
    static ArrayList<kereta> daftarPenumpang = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
       
    
    public kereta(String namaPenumpang, int nomorKereta, String rute, String waktuBerangkat, String nomorHp, int hargaKereta){
        this.namaPenumpang = namaPenumpang;
        this.nomorKereta = nomorKereta;
        this.rute = rute;
        this.waktuBerangkat = waktuBerangkat;
        this.nomorHp = nomorHp;
        this.hargaKereta = hargaKereta;   
    }
    
    public static void main(String[] args){
        daftarPenumpang.add(new kereta("Hafizh", 89, "Surabaya Gubeng", "08:00", "082211423123",  36000));
        daftarPenumpang.add(new kereta("Rama", 93, " Malang", "18:00", "082131231313", 31000));
        
        int pilihan;
        do{
            System.out.println("=======================================");
            System.out.println("          Stasiun Yogyakarta   ");
            System.out.println("=======================================");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Informasi Tiket");
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Keluar");
            System.out.println("=======================================");
            
            System.out.print("Pilih menu (1-6): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
       
            switch (pilihan) {
                case 1:
                     tambahTiket();
                     break;
                case 2:
                     tampilanPenumpang();
                     break;
                case 3:
                     updateTiket();
                     break;
                case 4:
                     hapusTiket();
                     break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;      
            default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    public static void tampilanPenumpang(){
        System.out.println("\n========  Stasiun Yogyakarta ========");   
        System.out.println("\n===========   Tiket  ==========");
        if (daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket masbro!");
        } else {
            int index = 1;
            for(kereta png : daftarPenumpang){ 
                 System.out.println("Nomor Tiket    : " + index);
                 System.out.println("Nama Penumpang : " + png.namaPenumpang);
                 System.out.println("Nomor Kereta   : " + png.nomorKereta);
                 System.out.println("Rute           : " + png.rute);
                 System.out.println("Waktu Berangkat: " + png.waktuBerangkat);
                 System.out.println("Nomor Handphone: " + png.nomorHp);
                 System.out.println("Harga Kereta   : " + png.hargaKereta);
                 System.out.println("==================================");
                 index++;
                }
        }
    }
    public static void tambahTiket() {
        System.out.println("\n========  Stasiun Yogyakarta ========");
        System.out.println("\n========   Tambahan Tiket   ==========");
        System.out.print("Masukkan nama penumpang: ");
        String namaPenumpang = scanner.nextLine();
        
        System.out.print("Masukkan nomor kereta: "); 
        int nomorKereta = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Masukan Tujuan Rute Kereta: ");
        String rute = scanner.nextLine();

        
        System.out.print("Masukan Waktu Berangkat (HH:MM): ");
        String waktu = scanner.nextLine();
        
        System.out.print("Masukan nomor HandPhone: ");
        String nomorHp = scanner.nextLine();
        
        System.out.print("Harga Kereta: ");
        int harga = scanner.nextInt();

        kereta pesan = new kereta(namaPenumpang, nomorKereta, rute, waktu, nomorHp, harga);

        daftarPenumpang.add(pesan);
        
        System.out.println("Data kereta berhasil ditambahkan!");
    }
    
    public static void updateTiket(){  
        System.out.println("\n===========  Update Tiket  ==========");
        if (daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket masbro!");
        } else {
            tampilanPenumpang();
            System.out.print("Masukkan nomor tiket yang ingin diperbarui: ");
            int update = scanner.nextInt();
            scanner.nextLine(); 

            if (update > 0 && update <= daftarPenumpang.size()) {
            kereta baru = daftarPenumpang.get(update - 1);

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

            System.out.print("Rute Baru           : ");
            String inputRute = scanner.nextLine();
            if (!inputRute.isEmpty()) {
                baru.rute = inputRute;
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
    public static void hapusTiket(){
        System.out.println("\n===========  Hapus Tiket  ==========");
        if (daftarPenumpang.isEmpty()){
            System.out.println("Tidak ada tiket masbro!");
        } else {
            tampilanPenumpang();
            System.out.print("Masukkan nomor tiket yang ingin dihapus: ");
            int hapus = scanner.nextInt();
            scanner.nextLine(); // 
            
            if (hapus > 0 && hapus <= daftarPenumpang.size()) {
                kereta dihapus = daftarPenumpang.remove(hapus - 1);
                System.out.println("==== Tiket kereta \"" + dihapus.namaPenumpang + "\" berhasil dihapus ====");
            } else {
                    System.out.println("Nomor tiket tidak valid");
                    }
                }
    }      
}

    
