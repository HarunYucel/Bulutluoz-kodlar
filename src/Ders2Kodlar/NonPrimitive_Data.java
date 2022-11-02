package Ders2Kodlar;

import java.util.Scanner;

public class NonPrimitive_Data {
    public static void main(String[] args) {
        String isim= "Alı akpınar";
        System.out.println(isim.toUpperCase());
        System.out.println(isim.toLowerCase());
        //nonprimitive data türleri deger yanında hazır method bulundururlar

        int BirinciHesabım = 100;
        int ikinciHesabım = 500;        // bankadaki hesapları tuttugum bir uygulama
        int ucuncuHesabım = 1000;
        System.out.println(ucuncuHesabım); //

        // kullanıcıdan adını alıp buyuk harflerle yazdırım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String kullanıcıAdı= scan.next();
        System.out.println(kullanıcıAdı.toUpperCase());

        // kullanıcıdan bir double bir de int sayı alıp
        // toplamını ve çarpımını yazdırın








    }
}
