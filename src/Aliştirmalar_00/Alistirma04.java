package Aliştirmalar_00;

import java.util.Scanner;

public class Alistirma04 {
    // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //      Isminiz : John
    //      Soyisminiz : Doe
    //      Yasiniz : 44
    //      Kaydiniz basariyla tamamlanmistir.
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("adınızi girin" );

        String ad = scan.nextLine();

        System.out.println("soyadinizi girin" );
        String soyad= scan.nextLine();


        System.out.println("yaşinizi girin" );
        int yas= scan.nextInt();
        System.out.println("adınız: " + ad+"\n" + "soyadiniz " + soyad+"\n"+ "yasiniz "+ yas +"\n" +
                "kaydiniz yapıldı");


    }
}
