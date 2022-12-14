package JavaPractice_Team105;

import java.util.Scanner;

public class Basit_Practice {

    /* * Ask user Name, Surname and credit card numbers than
     * convert it to special form
     *
             * (Check credit card number, if there aren’t 16 digit
     * print “Invalid credit card number”)
            *
            * Input : John White 1234234534561478
            * Output : Name : J*** W****
            *          CCN  : **** **** **** 1478
            *  (Initials for name and surname should be uppercase)

            Kullanıcı Adı, Soyadı ve kredi kartı numaralarını sor
      özel forma dönüştürün

             * (16 haneli değilse kredi kartı numaranızı kontrol ediniz.
     * "Geçersiz kredi kartı numarası") yazdırın
            *
            * Giriş : John White 1234234534561478
            * Çıktı : İsim : J*** W***
            * CCN : **** **** **** 1478
            * (Ad ve soyadının baş harfleri büyük olmalıdır)


     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim = scan.nextLine();

        System.out.print("Lutfen 16 haneli Kredi Karti Numaranizi giriniz : ");
        String ccn = scan.nextLine();

        if (ccn.length()!=16)
            System.out.println("Invalid credit card number");
        else {
         isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
         soyisim = soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
         ccn = "**** **** **** " + ccn.substring(12);

            System.out.println("Name : " + isim + " " + soyisim + "\nCCN : " + ccn );


}}}
