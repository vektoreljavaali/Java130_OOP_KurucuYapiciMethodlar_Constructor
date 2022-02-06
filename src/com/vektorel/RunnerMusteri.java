package com.vektorel;

import com.vektorel.entity.Musteri;

public class RunnerMusteri {
    public static void main(String[] args) {
        Musteri musteri =
                new Musteri("Muhammet","HOCA","0 555","Ankara");
        /**
         * Soru? Aşağıda ki kod mu daha okunaklı ve temiz yukarıda ki mi???
         */
        /*
        musteri.setSoyad("1");
        musteri.setAd("dsf");
        musteri.setAdres("afsadf");
        musteri.setTelefon("53435343");
         */
        System.out.println(musteri.toString());
    }
}
