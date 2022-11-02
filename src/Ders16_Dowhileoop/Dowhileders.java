package Ders16_Dowhileoop;

public class Dowhileders {
    public static void main(String[] args) {

        ///10 11 12 sayılarını toplayan bir while loop oluşturalım

        int sayi = 10;
        int toplam = 0;

        while (sayi <= 12) {
            toplam = sayi + toplam;
            sayi++;



        }
        System.out.println(toplam);
    }
}