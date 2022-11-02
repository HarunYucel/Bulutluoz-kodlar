package Aliştirmalar_00;

import java.util.Scanner;

public class baslangic {
    // kullanıcıdan ismini alıp buyuk yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen adınızı gırın");

        String Kullaniciadi= scan.next();

        System.out.println(Kullaniciadi.toUpperCase());
    }

}
