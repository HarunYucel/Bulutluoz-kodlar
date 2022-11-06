package JavaPractice_Team105;

import java.util.Scanner;

public class Q4Trenary_RakamPozitifsayi {

    //Kullanicidan bir sayi aliniz
    //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
    //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi= scan.nextInt();

        System.out.println(sayi>=0 && sayi<10 ? "rakam" : sayi< 0 ? "negatif":"pozitif");




















    }


}
