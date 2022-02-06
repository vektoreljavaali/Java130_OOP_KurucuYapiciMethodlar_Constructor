package com.vektorel;

import com.vektorel.entity.Kedi;

public class Runner {
    public static void main(String[] args) {
        System.out.println("UYGULAMAYA GİRİŞ YAPILDI..");
        Kedi kedi = new Kedi();
        System.out.println("KEDİ NESNESİ OLUŞTURULDU..");
        System.out.println("Kedi adı...: "+ kedi.getAd());
        System.out.println("Kedi yaşı..: "+ kedi.getYas());
        System.out.println("Kedi ağırlığı...: "+ kedi.getAgirlik());
        System.out.println(kedi.toString());
    }
}
