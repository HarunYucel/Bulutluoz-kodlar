package Ders21_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {
        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        List<Integer> sayilar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

    }
        System.out.println(sayilar);
        // Java'da set() u update icin kullanir
        // add() ile set() farklidir

        sayilar.set(0,8); /// index degistirme yapar eski degeri görmek istersek sout yapabiliriz

        System.out.println(sayilar.set(0, 8));
        int eskiDeger= sayilar.set(1,9);
        System.out.println(eskiDeger);
        System.out.println(sayilar);


}}
