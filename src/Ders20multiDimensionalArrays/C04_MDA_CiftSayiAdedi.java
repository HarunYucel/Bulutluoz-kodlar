package Ders20multiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {

    public static void main(String[] args) {

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};
        // Verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz

        int ciftsayi=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {



                if (arr[i][j]%2==0){
                   ciftsayi++;



            }

        }

    }

        System.out.println(ciftsayi);








}}



