/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class penumpang {
     public String namaPenumpang, tujuan, waktuBerangkat, nomorHp;
     public int nomorKereta, kapasitas, hargaKereta;
     
     public penumpang(String namaPenumpang, int nomorKereta, String tujuan, String waktuBerangkat, String nomorHp, int hargaKereta){
        this.namaPenumpang = namaPenumpang;
        this.nomorKereta = nomorKereta;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
        this.nomorHp = nomorHp;
        this.hargaKereta = hargaKereta;   
    }   
}
