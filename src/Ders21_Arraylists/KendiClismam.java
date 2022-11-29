package Ders21_Arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KendiClismam {

    // Soru 5- Kullanicidan pozitif bir tamsayi alip,
    //         o tamsayidan kucuk Fibonacci sayilarini bir liste olarak
    //          yazdirin
    // 0 1 1 2 3 5 8 13 21 34 55 89 144 .....

    public static void main(String[] args) {

        List<Integer>Fibonacciarr=new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("pozitif bir tamsayi girin");

        int Sayi = Fibonacciarr.size();
        int FibonacciSayi;

        while (Sayi>=0){

        for (int i = 0; i < Fibonacciarr.size() ; i++) {
            FibonacciSayi = Fibonacciarr.get((i-2) + Fibonacciarr.get(i-1));


        }




}
        System.out.println(Fibonacciarr);

    }
}
