package Soktative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class student {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        System.out.println(list.isEmpty());
        list.add(123);
        list.add(321);
        Collections.sort(list);

        list.clear();
        System.out.println(list);
        list.add(7);

        list.add(8);

        list.add(9);
        list.remove(9);
        System.out.println(list);













    }
}
