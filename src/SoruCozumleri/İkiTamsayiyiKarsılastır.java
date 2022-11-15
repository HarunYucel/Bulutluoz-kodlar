package SoruCozumleri;

import java.util.Scanner;

public class İkiTamsayiyiKarsılastır {

    /*İki sayıyı karşılaştıran bir Java programı yazınız. editöre git
Giriş Verileri:
İlk tam sayıyı girin: 25
İkinci tam sayıyı girin: 39
Beklenen çıktı

25 != 39
25 < 39
25 <= 39*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println( "iki tam sayi girin");

        double sayi1 = scan.nextDouble();
        double sayi2= scan.nextDouble();


         if  (sayi1 != sayi2)
         if  (sayi1>sayi2) {

             System.out.println( sayi1 + ": sayi2 den daha buyuk" );
        } else  System.out.println(sayi2 +  ": sayi1 den  buyuk ");






} }
