package SoruCozumleri;

import java.util.Scanner;



public class RakamlarToplami {
    /*
    Bir Java programı yazın ve bir tamsayının rakamlarının toplamını hesaplayın. editöre git
Giriş Verileri:
Bir tam sayı girin: 25
Beklenen çıktı

Rakamların toplamı: 7

    */

    public static void main(String[] args) {

       Scanner scan= new Scanner(System.in);
        System.out.println("Tamsayi gir");
        int tamsayi= scan.nextInt();

        System.out.println(rakamlartoplami(tamsayi));


    }

    private static int rakamlartoplami( int tamsayi) {
        int rakamlartoplami= 0;

        while ( tamsayi != 0) {
            rakamlartoplami+= tamsayi%10;
        tamsayi/= 10;



    }
    return rakamlartoplami;
}}
