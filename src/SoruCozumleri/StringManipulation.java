package SoruCozumleri;

import java.util.Scanner;

public class StringManipulation {

    // Soru 4 : Kullanicidan bir sifre isteyip,
    // asagidaki sartlari kontrol edin ve
    // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
    // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
    // - ilk harf kucuk harf olmali
    // - son karakter rakam olmali
    // - sifre bosluk icermemeli
    // - uzunlugu en az 10 karakter olmali

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" bir şifre girin");
        String sifre = scan.nextLine();

        int bayrak=0;


    if (!( sifre.charAt(0)  >= 'a' &&  sifre.charAt(0) <='z')) {

        bayrak++;
        System.out.println("ilk harkucuk olmali");


    } else if (!(sifre.length()-1 >=1 && sifre.length()-1<=9)) {
        bayrak++;

        System.out.println("son harf rakam olmali");

    } else if ( sifre.contains(" ")) {
        bayrak++;
        System.out.println("şifre boşluk içermemeli");

    } else if (!(sifre.length()<=10)) {
       bayrak++;

        System.out.println("uzunluk en az 10 haneli olmali");
    }
    else bayrak = 0;

        System.out.println("şifre başarıli ");

    }}






