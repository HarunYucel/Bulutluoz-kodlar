package ders47_Mapsmethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_PutİfAbsent {
    public static void main(String[] args) {

        Map<String,Integer>mp1=new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);


        System.out.println(mp1.putIfAbsent("D", 9)); //null
        System.out.println(mp1); //
        System.out.println(mp1.putIfAbsent("D", 15));//9

        /* putifabsent (k,v)  eğer (k) daha önce yoksa ekler ve null döner
                               eğeer (k) daha önce varse eklemek istediğimiz yeni değerei eklemez ve
                                eski var olan değeri bize döndürür.

         */


        Map<Integer,String>mp2=new HashMap<>();

        mp2.put(2,"S");
        System.out.println(mp2.putIfAbsent(3, "K")); // null
        System.out.println(mp2); // {2=S, 3=K}

        System.out.println(mp2.putIfAbsent(3, "Z")); // K
        System.out.println(mp2); // {2=S, 3=K}


    }
}
