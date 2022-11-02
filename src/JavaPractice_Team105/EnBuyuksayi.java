package JavaPractice_Team105;

import java.util.Scanner;

public class EnBuyuksayi {

    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println(" lutfen 5 tane sayi girin");
        int  enBuyuksayi = 0;
        int sayac = 0;

                while ( sayac<5) {
                    int sayi= scan.nextInt();

                   if (sayi>enBuyuksayi){
                       enBuyuksayi= sayi;
                   }

               sayac++;

        }
        System.out.println("girilen sayiların en buyugu ="+ enBuyuksayi);
    }




}
