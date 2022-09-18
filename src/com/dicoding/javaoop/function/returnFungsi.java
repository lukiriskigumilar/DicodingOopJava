package com.dicoding.javaoop.function;

public class returnFungsi {
    public static void main(String[] args){
        double p , i,hasil;
        p =7;
        i=6.5;
        hasil = hitungLuas(p, i); // memanggil fungsi
        System.out.println("Hasilnya adalah =" + hasil);
    }
    //fungsi nilai balik
     public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
     }
}
