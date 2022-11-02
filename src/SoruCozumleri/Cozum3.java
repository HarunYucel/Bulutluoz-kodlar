package SoruCozumleri;

import java.util.Scanner;

public class Cozum3 {
    //Girdi olarak bir sayı alan ve çarpım tablosunu aşağıdaki değere yazdıran bir Java programı yazınız.
    // Input a number: 8
    //Expected Output :
    //8 x 1 = 8
    //8 x 2 = 16
    //8 x 3 = 24
    //...
    //8 x 10 = 80

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int sayi1= scanner.nextInt();

        for (int i = 0; i <10 ; i++) {
            System.out.println(sayi1 + " x " + (i+1) + " = " +
                    (sayi1 * (i+1)));



        }



    }






}
