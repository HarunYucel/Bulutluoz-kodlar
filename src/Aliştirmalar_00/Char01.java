package Aliştirmalar_00;

import java.util.Scanner;

public class Char01 {
    // kullanicidan char bir karakter alin
    // o karakterden sonra gelen 3 karakteri yazdirin
    // ornek input : a , output : bcd

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter girin" );
        char karakter = scan.next().charAt(0);
        System.out.println("" + (char) (karakter+1) + (char) (karakter+2) + (char) (karakter+3));

    }
}
