package com.medipol.SpringBootOrnek;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTServisi {

    private static final List<Ogrenci> OGRENCILER = new ArrayList<Ogrenci>();
    
    private Object kilit = new Object();
    
    @RequestMapping("/ogrenci/olustur")
    public synchronized Ogrenci ogrenciOlustur(String ad, String soyad){
        synchronized (kilit) {
            Ogrenci ogrenci = new Ogrenci(ad, soyad);
            OGRENCILER.add(ogrenci);
            return ogrenci;
        }
    }
    
    @RequestMapping("/ogrenci/listele")
    public synchronized List<Ogrenci> ogrenciListele(){
        synchronized (kilit) {
            if (OGRENCILER.size()>10) {
                return OGRENCILER.subList(0, 10);
            } else {
                return OGRENCILER;
            }
            
        }
    }
    
    @RequestMapping("/ogrenci/temizle")
    public String ogrenciTemizle(){
        synchronized (kilit) {
            OGRENCILER.clear();
            return "OK";
        }
    }
    
    
    
    
    
    
}
