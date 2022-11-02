package Aliştirmalar_00;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        //kullanıcından bir tam sayı alın kullanıcı kaç girerse girsin konsolda -128ile + 127
        // arasında bir sayı olacak şekilde bir kod yazdırın.

        Scanner scan= new Scanner(System.in);

        System.out.println( "bir sayı girininiz");

        int sayi= scan.nextInt();
        byte donusensayi= (byte) sayi;

        System.out.println( sayi +","+ donusensayi);
        //System.out.println("girdiginiz " + girilenSayi + "'nin donusmus hali : " + donusensayi);




        }

    }
