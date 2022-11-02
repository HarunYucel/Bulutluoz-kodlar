package SoruCozumleri;

import java.util.Scanner;

public class C02_Cozum2 {


    public static void main(String[] args) {

        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3

        int sayi1= -5 + 8 *6;
        int sayi2= (55+9) % 9;
        int sayi3= 20 + -3*5 / 8;
        int sayi4=  5 + 15 / 3 * 2 - 8 % 3;

        System.out.println( ":sonuç"+ sayi1 + "sonuç"+ sayi2  +":sonuç"+ sayi3+ "sonuç" + sayi4    );


        int Inputfirstnumber= 25;
        int Inputsecondnumber= 5;

        int sonuc= 25*5;

        System.out.println(sonuc);

        Scanner scan= new Scanner(System.in);
        System.out.println( "say 1 gir");

        int no1= scan.nextInt();
        System.out.println("say2 gir");
        int no2= scan.nextInt();

        System.out.println("sayiların carpım:"+ no1*no2);




    }



    }



