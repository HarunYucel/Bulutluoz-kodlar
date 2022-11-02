package JavaPractice_Team105;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Q1_BölmeOperatörükullanmadanBölme {

    //Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
    // kullanmadan islemini gerceklestirip bolumu hesaplayan method create ediniz.

       static int bolum = 0; // static olarak tanımlamazsak static olan main methoda alamayiz.

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölmek istediğiniz sayiyi giriniz");
        int bolunen= scan.nextInt();
        System.out.println("Lütfen bölen istediğiniz sayiyi giriniz");
       int bolen= scan.nextInt();

        System.out.println(bolunen+ "/"+ bolen + "=" + bol(bolunen,bolen));


    }

    public static int bol(int bolunen, int bolen) {

        while (bolunen>=bolen) {
        bolunen-=bolen;

        bolum++;


    }
    return bolum;
    }}


