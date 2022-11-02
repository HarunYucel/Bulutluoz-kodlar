package Ders16_Dowhileoop;

import java.util.Scanner;

public class Dowhile_4 {
    public static void main(String[] args) {
        // kullanıcıdan bir pozitif sayı alın
        // sayının tam kare olup olmadığını kontrol edin
        // tam kare ise true değilse false

        int input = 49;
        int baslangıc = 1;
        int bayrak = 0;
        do {
            if (baslangıc * baslangıc == input) {
                System.out.println("true");
                bayrak++;
                break;
            }
            baslangıc++; }

            while (baslangıc * baslangıc <= input) ;

            if (bayrak == 0) {
                System.out.println("false");
            }


        }

    }