/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import service.tiket;

public class main {
     public static void main(String[] args) {
        tiket menu = new tiket();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do{
            System.out.println("=======================================");
            System.out.println("          Stasiun Yogyakarta   ");
            System.out.println("=======================================");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Informasi Tiket");   
            System.out.println("3. Update Tiket");
            System.out.println("4. Hapus Tiket");
            System.out.println("5. Cari Kereta");
            System.out.println("6. Keluar");
            System.out.println("=======================================");
            
            System.out.print("Pilih menu (1-6): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
       
            switch (pilihan) {
                case 1:
                     menu.tambahTiket();
                     break;
                case 2:
                     menu.tampilPenumpang();
                     break;
                case 3:
                     menu.updateTiket();
                     break;
                case 4:
                     menu.hapusTiket();
                     break;
                     
                case 5:
                     menu.cariKereta();
                     break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;      
            default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}
