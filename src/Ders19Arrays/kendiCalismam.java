package Ders19Arrays;

public class kendiCalismam {

    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int [] arr={3,8,1,5,2,9};


        EnbuyukveKsayilar(arr);




    }

    public static void EnbuyukveKsayilar(int[] arr) {
           int enkucukeleman=arr[0];
           int enbuyukEleman= arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<arr[i+1]);
            enkucukeleman=arr[i];

            if (arr[i]>arr[i+1]);
            enbuyukEleman=arr[i];
        }

        System.out.println("EnBuyukeleman :"+ enbuyukEleman + "enkucukeleman : " + enkucukeleman   );

    }


}
