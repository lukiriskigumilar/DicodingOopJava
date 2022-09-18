package com.dicoding.javaoop.object;

public class main {
    public static void main (String[] args){
        // menciptkan object dengan nama hewan

        Hewan Elang = new Hewan("Elang" ,200);
        Hewan kucing = new Hewan("kucing" , 21);
        Hewan angsa = new Hewan("angsa",554);

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.setHabitat("udara");
        Elang.cetakHewan();
System.out.println("");
        kucing.beratHewan(2);
        kucing.setHabitat("daratan");
        kucing.jumlahKakiHewan(4);
        kucing.cetakHewan();
System.out.println("");
        angsa.beratHewan(2);
        angsa.setHabitat("dartan dam udara");
        angsa.jumlahKakiHewan(2);
        angsa.cetakHewan();


    }
}
