package JavaPractice_Team105;

import java.util.Arrays;

public class İsimlerinHrfleriCharArrolarakAlma {
    /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */
    public static void main(String[] args) {

        String name = "Semra";
        kelimeninHarfleriArrayi(name);
        kelimeninHarfleriArrayi("String");
        kelimeninHarfleriArrayi("ayse");
    }

    public static void kelimeninHarfleriArrayi(String input){

        char[] output = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            output [i] = input.charAt(i);
        }
        System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));







}}
