package SoruCozumleri;

import java.util.Scanner;

public class Cokgen {
 /*
 Bir çokgenin alanını hesaplayan bir Java programı yazın. editöre git
Bir çokgenin alanı = (n*s^2)/(4*tan(π/n))
burada n, n kenarlı çokgen ve s bir kenarın uzunluğudur
Giriş Verileri:
Çokgenin kenar sayısını girin: 7
Kenarlardan birinin uzunluğunu girin: 6
Beklenen çıktı

Alan: 130.82084798405722
  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kenar sayisi ve \n bir kenar uzunluğu gir ");
        int kenarsayisi= scan.nextInt();
        int kenaruzunluğu= scan.nextInt();
        //Bir çokgenin alanı = (n*s^2)/(4*tan(π/n))
       double CokgenAlan= (kenarsayisi*kenaruzunluğu*kenaruzunluğu)/(4*Math.tan(Math.PI/kenarsayisi));

        System.out.println(CokgenAlan);


    }





}
