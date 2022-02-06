package com.vektorel.entity;

public class Kedi {

    private String ad;
    private int yas;
    private String renk;
    private int agirlik;
    private String tur;
    private String cins;
    private boolean uyku;
    private int hiz;

    /**
     * Constructor -> Kurucu ya da Yapıcı Method
     * Syntax -> Erişim Belirteci Eklenir. genellikle Public dir.     *
     * return -> Eklenmez. yani void,int,String v.s. yazılmaz.
     * Method adı-> Sınıfın adı ne ise bu method un adı da odur. birebir
     * sınıf adı ile aynı olmak zorundadır.
     * Parametre-> Opsiyonel dir. method içine parametre alabilir de almaya bilirde
     * yazılımcını kurgusuna göre bu değişim gösterir.
     * BİLGİ: yapıcı method sınıf tan nesne yaratılmadan önce çalışır. sınıf içinde
     * default işlemler yapmak için kullanılır. Geridönüş tipi eklenmese bile
     * geri dönüş tipi vardır. o da sınıf objesidir.
     */

    /**
     * Default Constructor
     * Bu method yazılmasa bile her sınıfın default constructor u vardır.
     */
    public Kedi(){
        ad = "Yumoş";
        agirlik = 120;
        renk = "sarı";
        System.out.println("Default Constructor Çalıştı");
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", renk='" + renk + '\'' +
                ", agirlik=" + agirlik +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", uyku=" + uyku +
                ", hiz=" + hiz +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public boolean isUyku() {
        return uyku;
    }

    public void setUyku(boolean uyku) {
        this.uyku = uyku;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
}
