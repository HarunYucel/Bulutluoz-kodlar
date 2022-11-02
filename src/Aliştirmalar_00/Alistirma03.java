package Aliştirmalar_00;

import java.util.Scanner;

public class Alistirma03 {
    public static void main(String[] args) {
        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
                // dikdortgenin alanini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("dikdortgen kısa kenar gırın");
        int kisakenar= scan.nextInt();
        Scanner scan1= new Scanner(System.in);
        System.out.println("dikdortgen uzun kenar gırın");
        int uzunkenar= scan.nextInt();
        System.out.println( "diktortgen alan:"+ kisakenar*uzunkenar);
    }
}
