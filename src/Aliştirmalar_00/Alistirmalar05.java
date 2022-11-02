package Aliştirmalar_00;

import java.util.Scanner;

public class Alistirmalar05 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan= new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz" );

        double sayi1= scan.nextInt();

        System.out.println("ikinci sayıyı girin");
        double sayi2= scan.nextDouble();

        double bos;
        bos= sayi2;
        sayi2 = sayi1;
        sayi1 = bos;
        System.out.println("sayi1 in degeri:" + sayi1+"\n" + "sayi2 nin degeri:" + sayi2 );






    }
}
