package Ders18Arrays;

public class C01ArrayelementineUlasmadDegistirme {
    public static void main(String[] args) {

        //arr nin elementlerine ulaşmak ve yazdırmak istiyorsak ya da bu elementleri update yani
        //değiştirmek istiyorsak

        int[] arr1= {2,4,6,8,10};
        System.out.println(arr1[2]);

        System.out.println(arr1[3]);
        arr1[3]=20;
        System.out.println(arr1[3]);

        // arrnin tüm elementlerini yazdırmak istiyorsak length kullanırız

        System.out.println(arr1.length);

        // son elementi yazdırın

        System.out.println (arr1[arr1.length-1]);
        // array'in tum elementlerini yazdirin
        for (int i = 0; i < arr1.length ; i++) {

            System.out.print(arr1[i] + " ");

            System.out.println(arr1[5]);




        }







    }
}
