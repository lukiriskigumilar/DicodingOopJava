package com.dicoding.javaoop.function;

public class MethodOverloading {
    public static void main(String[] args){
        double p ,i ,hasil;
        int pn,lb,hsl;
        p = 7;
        i=6.5;
        hasil = hitungLuas(p,i);
        System.out.println("hasilnya adalah = " + hasil);
        pn = 7;
        lb = 6;
        hsl = hitungLuas(pn,lb);
        System.out.println("Hasilnya adalah = " + hsl);


    }
    public static double hitungLuas(double panjang,double lebar){
        double luas = panjang*lebar;
        return luas;
    }
    public  static int hitungLuas(int panjang , int lebar){
        int luas = panjang*lebar;
        return luas;
    }
}
