package Aliştirmalar_00;

import java.util.Scanner;

public class Alistirmalar02 {


    //kullanıcıdan bir double bir de int sayı alıp bundarın toplamını ve çarpımını yazdırın.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int sayi= scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("bir ondalıklı sayı girin");
        double sayi1 = scan1.nextDouble();
        System.out.println( "sayılar toplami:" +sayi+sayi1 );
        System.out.println("sayilar çarpimi: " + sayi*sayi1);

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.












    }
}
