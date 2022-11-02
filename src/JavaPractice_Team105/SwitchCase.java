package JavaPractice_Team105;

import java.util.Scanner;

public class SwitchCase {

    /*
   Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istedigini alin
   ve girilen harfin karsiligini yazdirin.

   I : International S : Software T : Testing Q : Qualifications B: Board
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ISTQB kisaltmasindan anlamini ogrenmek istediginiz harfi giriniz");
        char harf = scan.next().charAt(0);

        switch (harf){

            case 'I' :
                System.out.println("International");
                break;
            case 'S' :
                System.out.println("software");
                break;
            case 'T' :
                System.out.println("testing");
                break;
            case 'Q' :
                System.out.println("qualification");
                break;
            case 'B' :
                System.out.println("board");
                break;
            default :
                System.out.println(" Lutfen gecerli bir harf giriniz");

        }
    }





}
