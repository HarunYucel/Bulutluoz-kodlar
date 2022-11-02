package SoruCozumleri;

import java.util.Scanner;

public class Cozum5 {
    public static void main(String[] args) {

        //Bir dikdörtgenin alanını ve çevresini yazdıran bir Java programı yazın.
        // Test verisi:
        //Genişlik = 5,5 Yükseklik = 8,5
        //Dikdörtgenin alanı genişliği ile uzunluğunun çarpımına eşittir. Yani dikdörtgenin bir uzun kenarı
        // ile bir kısa kenarının çarpımı alanını vermektedir.
        // Dikdörtgenin kısa kenarına a uzun kenarına b dersek; Dikdörtgen Alanı= (a x b) formülünden bulunur
        // Dikdörtgenin çevresi kısa kenar uzunuluğu ile uzun kenar uzunluğu toplamının iki katına eşittir.
        //Beklenen çıktı
        //Alan 5.6 * 8.5 = 47.60
        //Çevre 2 * (5,6 + 8,5) = 28,20



        Scanner scan = new Scanner(System.in);
        System.out.println("dikdörtgen alan ve cevre hesabı için KISA kenar ve UZUN kenar giriniz:");

        int kisakenar= scan.nextInt();
        int uzunkenar= scan.nextInt();
        int Dikdortgenalan=  kisakenar*uzunkenar;
        int Dikdortgencevre= 2*(kisakenar + uzunkenar);


        System.out.println ( "Dikdortgenalani  :" + Dikdortgenalan +
                   "dikdortgen çevresi :" + Dikdortgencevre);












    }




}
