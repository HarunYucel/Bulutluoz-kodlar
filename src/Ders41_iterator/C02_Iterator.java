package Ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1 = sayilar.iterator();

        //tüm elementleri iterator kullanarak yazdiralim
        
        System.out.println(it1.hasNext());// true
        System.out.println(it1.next());//10

        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//20

        System.out.println("============");

        while (it1.hasNext()){

            System.out.println(it1.next());
        }

      // iterator nereye kadar iteratore ettiysek orada kalir
        // bastan itibaren yazdirmak istersek yen
        //
        // bir iterator olusturmamiz gerekir


    }

}
