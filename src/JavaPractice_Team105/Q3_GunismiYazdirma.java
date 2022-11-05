package JavaPractice_Team105;


import java.util.Scanner;

public class Q3_GunismiYazdirma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen gun numarasi giriniz : ");
        int gunSayisi = scan.nextInt();

        System.out.println("==================== IF ELSE Cozumu ========================");

        if (gunSayisi<=0 || gunSayisi>7) System.out.println("Gecersiz giris yaptiniz!");
        else if (gunSayisi==1) System.out.println("Pazartesi");
        else if (gunSayisi==2) System.out.println("Sali");
        else if (gunSayisi==3) System.out.println("Carsamba");
        else if (gunSayisi==4) System.out.println("Persembe");
        else if (gunSayisi==5) System.out.println("Cuma");
        else if (gunSayisi==6) System.out.println("Cumartesi");
        else System.out.println("Pazar");

        System.out.println("==================== SWITCH CASE Cozumu ========================");

        switch (gunSayisi){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun sayisi girdiniz!");
        }

/*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore
          hafta ici veya hafta sonu yazdirin
         */
        System.out.println("gun ismi girin");
        String  gunismi= scan.next();

        switch ( gunismi ){


            case "pazartesi":
                System.out.println("girdiğiniz gun hafta içi");
                break;
            case "sali":
                System.out.println("girdiğiniz gun hafta içi");
                break;
            case "çarşamba":
                System.out.println("girdiğiniz gun hafta içi");
                break;
            case "perşembe":
                System.out.println("girdiğiniz gun hafta içi");
                break;
            case "cuma":
                System.out.println("girdiğiniz gun hafta içi");
                break;
            case "cumartesi":
                System.out.println("girdiğiniz gun hafta sonu");
                break;
            case "pazar":
                System.out.println("girdiğiniz gun hafta sonu");
                break;

            default:
                System.out.println("yalnış giriş yaptınız");


        }






}}
