package Ders19Arrays;

import java.util.Arrays;

public class C02_EnkucukEnbuyukElementibulma {
    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int [] arr={3,8,1,5,2,9};

        enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir(int[] arr){
        Arrays.sort(arr);
        System.out.println("enbuyukelement:"+ arr[arr.length-1]);
        System.out.println("enkucukelement:"+ arr[arr[0]]);



    }

}
