package ders47_Mapsmethodlari;


import java.util.HashMap;
import java.util.Map;

public class C04_Soru {

    // verilen bir cümlede kullanılan karakterleri ve kaçarkere kullanıldıgını yazdırın

    public static void main(String[] args) {


    String str= "javayi balonu patlatmadan bitirelim";

    // j= 1, a= 7, v= 1, y= 1 ......

    String[]strArr= str.split("");

    Map<String,Integer> kullanimMiktarlariMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {

            kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v)-> v+1 );

            kullanimMiktarlariMap.putIfAbsent(strArr[i],1);

        }

        System.out.println(kullanimMiktarlariMap);







}}
