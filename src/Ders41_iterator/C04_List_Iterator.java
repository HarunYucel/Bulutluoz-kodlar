package Ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_List_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //iterator kullarak listenin elementlerini sondan başa doğru yazdirin
           // ön ce iteratoru sona götürelim

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext() ){

            lit.next();
        }

        while (lit.hasPrevious() ){

            System.out.println(lit.previous()+ " ");


    }
        System.out.println("");
        System.out.println(lit.nextIndex()); //iteratornextIndex kullanarak nerede kaldiğimizi görürüz.

        // iterator kullanarak, listenin tüm elementlerini 5 artırın

        while (lit.hasNext()){
            lit.set((Integer)lit.next()+5);
        }

        System.out.println(sayilar);

        //iterator kullanarak 40 dan küçük olan elementleri silin

        while (lit.hasPrevious()){
            if ((Integer)lit.previous()<40){
            lit.remove();

        }

}
        System.out.println(sayilar);


}
}
