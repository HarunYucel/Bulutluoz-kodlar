import java.util.Scanner;

public class ders02_scanner {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdört genin iki kenar uzunlugunu girin +" +
                        " \n iki kenar uzunlugu arasında enter'a basın");
        double bırıncıkenar=scan.nextDouble();
        double ıkıncıkenar=scan.nextDouble();
        System.out.println("dikdörtgen alan:"+ bırıncıkenar*ıkıncıkenar );




    }
}
