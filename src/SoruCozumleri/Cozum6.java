package SoruCozumleri;

import java.util.Scanner;

public class Cozum6 {
    //İki değişkeni değiştirmek için bir Java programı yazın


    public static void main(String[] args) {

        int x, y, z;
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        x = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        y = scan.nextInt();

        z = x;
        x = y;
        y = z;

        System.out.println(" Değiştirilen değerler :" + x + " ve " + y);




















    }




}
