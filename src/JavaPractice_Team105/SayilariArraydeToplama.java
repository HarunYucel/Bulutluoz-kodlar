package JavaPractice_Team105;

import java.util.Arrays;
import java.util.Scanner;

public class SayilariArraydeToplama {


    public static void main(String[] args) {

        // Kullanicidan istedigi kadar sayi alip, bu sayilari bir Array'de toplayip
        // bu sayilarin toplamini yazdiran bir program yaziniz


        Scanner scan = new Scanner(System.in);

        System.out.println(" toplamak istediginiz sayi adedi kaçtır");
        int sayıadedi= scan.nextInt();
        int[] arr= new int[sayıadedi];


        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {

            toplam+= arr [i];

        }
        System.out.println(toplam);
    }
}
