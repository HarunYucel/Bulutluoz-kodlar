package Ders19Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin
        Scanner scan= new Scanner(System.in);
        int[] arr={0};
        int girilensayi=0;

        do {
            System.out.println("array'e eklemek icin bir tamsayi giriniz " +
                    "\nBitirmek icin 0'a basin");
            girilensayi= scan.nextInt();

            if (arr[0]==0 ){
                arr[0]=girilensayi;
            }else if(girilensayi!=0){
                C08_ArrayaElemanEklememethodu C08_ArrayeElemanEklemeMethodu;
               }

        }while(girilensayi!=0);
        System.out.println(Arrays.toString(arr));


            }
}
