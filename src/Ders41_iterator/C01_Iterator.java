package Ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {
        List<Integer>sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //inde kullanmadan listin tüm elementlerini yazdirin
        for (Integer each: sayilar
             ) {
            System.out.print(sayilar + " ");

        }

        ///for (Integer each: sayilar

             //) { each+1= each

            //System.out.print(each+1+ " ");

        }

        //for (Integer each: sayilar


       // ) {System.out.print(each+1+ " ");



        }

