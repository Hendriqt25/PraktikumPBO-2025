package com.mycompany.praktium;
import java.util.ArrayList;
import java.util.Scanner;

public class kereta {
    
    public String namaKereta, tujuan, waktuBerangkat, namaPenumpang, nomorHp;
    public int nomorKereta, kapasitas, hargaKereta;
    
    static ArrayList<kereta> daftarPenumpang = new ArrayList<>();
    static ArrayList<kereta> daftarKereta = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
       
    public kereta(int nomorKereta, String namaKereta, String tujuan, String waktuBerangkat, int kapasitas, int hargaKereta){
        this.nomorKereta = nomorKereta;
        this.namaKereta = namaKereta;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.kapasitas = kapasitas;
        this.hargaKereta = hargaKereta;
    }
    
    public kereta(String namaPenumpang, int nomorKereta, String tujuan, String waktuBerangkat, String nomorHp, int hargaKereta){
        this.namaPenumpang = namaPenumpang;
        this.nomorKereta = nomorKereta;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.nomorHp = nomorHp;
        this.hargaKereta = hargaKereta;   
    }
    
    public static void main(String[] args){
        
        daftarKereta.add(new kereta(101, "Argo Wilis", "Bandung", "07:00", 300, 250000));
        daftarKereta.add(new kereta(102, "Taksaka", "Jakarta", "08:30", 350, 300000));
        daftarKereta.add(new kereta(103, "Prameks", "Solo", "18:00", 400, 100000));
        
        daftarPenumpang.add(new kereta("Hafizh", 101, "Bandung", "07:00", "082211423123",  250000));
        daftarPenumpang.add(new kereta("Rama", 103, " Solo", "18:00", "082131231313", 100000));
        
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
            
            System.out.print("Pilih menu (1-5): ");
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
    
    public static void tampilanKereta(){
        System.out.println("\n========  Stasiun Yogyakarta ========");   
        System.out.println("\n==========  jadwal Kereta  ==========");
        for(kereta krt : daftarKereta){
            System.out.println("Nomor Kereta    : " + krt.nomorKereta);
            System.out.println("Nama Kereta     : " + krt.namaKereta);
            System.out.println("Tujuan          : " + krt.tujuan);
            System.out.println("Waktu Berangkat : " + krt.waktuBerangkat);
            System.out.println("Kapasitas       : " + krt.kapasitas);
            System.out.println("Harga Kereta    : " + krt.hargaKereta);
            System.out.println("==================================");
        }
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
                 System.out.println("Tujuan         : " + png.tujuan);
                 System.out.println("Waktu Berangkat: " + png.waktuBerangkat);
                 System.out.println("Nomor Handphone: " + png.nomorHp);
                 System.out.println("Harga Kereta   : " + png.hargaKereta);
                 System.out.println("==================================");
                 index++;
                }
        }
    }
    public static void tambahTiket() {
        tampilanKereta();
        System.out.println("\n========   Tambahan Tiket   ==========");
        System.out.print("Masukkan nama penumpang: ");
        String namaPenumpang = scanner.nextLine();
        
        System.out.print("Masukkan nomor kereta: "); 
        int nomorKereta = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Masukan Tujuan Kereta: ");
        String tujuan = scanner.nextLine();

        
        System.out.print("Masukan Waktu Berangkat (HH:MM): ");
        String waktu = scanner.nextLine();
        
        System.out.print("Masukan nomor HandPhone: ");
        String nomorHp = scanner.nextLine();
        
        System.out.print("Harga Kereta: ");
        int harga = scanner.nextInt();

        kereta pesan = new kereta(namaPenumpang, nomorKereta, tujuan, waktu, nomorHp, harga);

        daftarPenumpang.add(pesan);
        
        System.out.println("Pesan Kereta berhasil ditambahkan yeyy masborrr!");
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
    

    


