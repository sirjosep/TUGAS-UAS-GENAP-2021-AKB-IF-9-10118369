package com.josepvictorr.tugas_uas_akb_genap_2021_10118369.model;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Wisata1 {
    public String nama_tempat;
    public String alamat_tempat;
    public String biaya_masuk;
    public String gambar_tempat;

    public String getNama_tempat() {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String getAlamat_tempat() {
        return alamat_tempat;
    }

    public void setAlamat_tempat(String alamat_tempat) {
        this.alamat_tempat = alamat_tempat;
    }

    public String getBiaya_masuk() {
        return biaya_masuk;
    }

    public void setBiaya_masuk(String biaya_masuk) {
        this.biaya_masuk = biaya_masuk;
    }

    public String getGambar_tempat() {
        return gambar_tempat;
    }

    public void setGambar_tempat(String gambar_tempat) {
        this.gambar_tempat = gambar_tempat;
    }

    public Wisata1(){

    }

    public Wisata1(String nama_tempat, String alamat_tempat, String biaya_masuk, String gambar_tempat){
        this.nama_tempat = nama_tempat;
        this.alamat_tempat = alamat_tempat;
        this.biaya_masuk = biaya_masuk;
        this.gambar_tempat = gambar_tempat;
    }

    @Exclude
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("nama_tempat", nama_tempat);
        result.put("alamat_tempat", alamat_tempat);
        result.put("biaya_masuk", biaya_masuk);
        result.put("gambar_tempat", gambar_tempat);
        return result;
    }
}
