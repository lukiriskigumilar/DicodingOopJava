package com.dicoding.javaoop.object;

public class Hewan {

    String nama,habitat;
    int berat, jumlahKaki,harga;

    // merupakan konstruktor dari kelas hewan
    public Hewan(String namaHewan, int hargahewan){
        nama = namaHewan;
        harga = hargahewan;

    }

    public void setHabitat(String setHabitat){
        habitat = setHabitat;
    }

    public void  beratHewan (int beratHewan){
        berat = beratHewan;
    }

    public void jumlahKakiHewan(int JumlahKakiHewan){
        jumlahKaki = JumlahKakiHewan;
    }

    public void cetakHewan(){
        System.out.println("nama hewan : " + nama );
        System.out.println("harga nya adalah " + harga);
        System.out.println("tempat hidup biasanya di " + habitat);
        System.out.println("berat hewan : " + berat +"kg");
        System.out.println("jumlah kaki " + jumlahKaki);
    }

}
