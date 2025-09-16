/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class kereta {
    public String namaKereta, tujuan, waktuBerangkat;
    public int nomorKereta, kapasitas, hargaKereta;
    
    public kereta(int nomorKereta, String namaKereta, String tujuan, String waktuBerangkat, int kapasitas, int hargaKereta){
        this.nomorKereta = nomorKereta;
        this.namaKereta = namaKereta;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.kapasitas = kapasitas;
        this.hargaKereta = hargaKereta;
    }
}
