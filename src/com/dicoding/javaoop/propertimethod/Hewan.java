package com.dicoding.javaoop.propertimethod;

public class Hewan {

    // properti atau fields

    // insialisasi dengan nilai inisial
    // double tinggi = 32;
    // double berat =  33

    // insialisasi dengan konstruktor
    double tinggi ;
    double berat ;

    int umur;
    // konstrukter dengan paramater
    Hewan(int umur, double tinggi, double berat){
        this.umur = umur;
        this.tinggi = tinggi;
        this. berat = berat;
    }

    void lari(){
        System.out.println("berlari dengan sangat cepat");
    }
    void jalan(){
        System.out.println("berjalan dengan pelan ...");
    }

    void makan(){
        System.out.println("makan dengan menggunakan mulut");
    }

    void hilang(){
        System.out.println("kucing di ambil orang");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }


}
