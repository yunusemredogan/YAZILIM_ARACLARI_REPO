package com.medipol.SpringBootOrnek;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTServisi {

    private static final List<Ogrenci> OGRENCILER = new ArrayList<Ogrenci>();
    
    @RequestMapping("/ogrenci/olustur")
    public Ogrenci ogrenciOlustur(String ad, String soyad){
        Ogrenci ogrenci = new Ogrenci(ad, soyad);
        OGRENCILER.add(ogrenci);
        return ogrenci;
    }
    
    @RequestMapping("/ogrenci/listele")
    public List<Ogrenci> ogrenciListele(){
        return OGRENCILER;
    }
}
