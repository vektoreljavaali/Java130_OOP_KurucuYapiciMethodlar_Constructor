package com.vektorel.entity;

import java.util.UUID;

public class Musteri {

    private String id;
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;

    /**
     * Parametreli Constructor, dışarıdan default olarak atanacak değerleri alır
     * ve sınıf içindeki değişkenlere atar.
     * ÖNEMLİ!!!!!
     * ÇOOOOOOOOOOOOOK ÖNEMLİ!!!
     * NOT: Eğer sınıf içinde parametreli constructor yazıyor iseniz ve
     * default constructor u elle tekrardan yazmadı iseniz. sınıfın otomatik
     * oluşturduğu connstructor ezilir, yok olur, kullanılmaz hale gelir.
     *
     * @param ad
     * @param soyad
     * @param telefon
     * @param adres
     */
    public Musteri(String ad,String soyad,String telefon,String adres){
        /**
         * Dışarıdan gelen tüm değerleri içeride değişkenlere atamalıyız.
         * SORUN VARRRR?????
         * Bu Sınıf diye belirtebileceğimiz. this keyword u nü kullanacağız.
         */
        // Rastgele bir benzersiz id oluşturup atıyoruz.
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
