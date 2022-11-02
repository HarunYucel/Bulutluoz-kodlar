package JavaPractice_Team105;

import java.util.ArrayList;
import java.util.List;

public class C02Alisrma2 {
    public static void main(String[] args) {

        //Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.


        int[]arr={1,2,3,4,2,3,3,6,2,5,8,5,8,4};

        List<Integer>tekrarsizlist=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!(tekrarsizlist.contains(arr[i])))
            {
                tekrarsizlist.add(arr[i]);

            }
                }

        tekrarsizlist.add(20);
        System.out.println(tekrarsizlist);



        }

}







