package com.dicoding.javaoop.propertimethod;

public class main {
    public static void main(String[] args){
        // kita tambhakan 1 argumen dengan nilai int 2
        // nilai tersebut adalah nilai yang digunakan untuk insialisasi variabel umur

     Hewan kucing = new Hewan(2, 30, 3);
     kucing.makan();
     kucing.jalan();
     kucing.lari();
     kucing.hilang();



     // Contoh Penggunaan fungsi get umur
        System.out.println("Umurnya adalah " + kucing.getUmur());

        //perhitungan indeks masa tubuh (bmi)
        // berat(kg / ((tinggi (m) * tinggi (m))

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01 ));
        System.out.println("indeks masa tubuhnya adalah " + bmi);



    }
}
