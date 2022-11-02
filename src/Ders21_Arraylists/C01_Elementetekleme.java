package Ders21_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C01_Elementetekleme {
    public static void main(String[] args) {

        List<Integer>sayilar=new ArrayList<>();
        System.out.println(sayilar);//[] Bos array olusturur

        System.out.println(sayilar.add(10)); //true
        System.out.println(sayilar);
        sayilar.add(20);
        System.out.println(sayilar);// [10, 20] tersi soylenmedikce elementi sona ekler
        sayilar.add(1,15);
        System.out.println(sayilar);//[10, 15, 20]
        // listenin basina 44 ekleyin

        sayilar.add(0,44);
        System.out.println(sayilar);


        // sayilar listesinin sonuna eklenecekListeyi ekleyin
        List<Integer>Eklenecekliste= new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);

        sayilar.addAll(Eklenecekliste);
        System.out.println(sayilar);

        // sayilar listesinin basindaki 44'den sonraya eklenecek listeyi ekleyin
        sayilar.addAll(1,Eklenecekliste);

        System.out.println(sayilar);





















    }





}
