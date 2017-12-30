package com.medipol.SpringBootOrnek;

public class Ogrenci {
    public static int COUNT = 0;
    private int id;
    private String ad;
    private String soyad;
    public Ogrenci(String ad, String soyad) {
        this.id = COUNT;
        this.ad = ad;
        this.soyad = soyad;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    
}
