package SoruCozumleri;

import java.util.Scanner;

public class Cozum4 {
    public static void main(String[] args) {


        //Bir dairenin alanını ve çevresini yazdıran bir Java programı yazın
        //Radius yarıçap =7.5
        //Perimeter is Çevre (şimdiki değeri) = 47.12388980384689
        //Area is  Alan (şimdiki değeri) = 176.71458676442586
    /*Tüm dairenin alanını bulmak için A=π.r2 alan formülü kullanılır.
     Dairenin bir parçası çeyrek veya yarım olarak istenirse tüm dairenin alanı
      2'ye bölünerek yarı çap veya 4'e bölünerek bulunabilir.
    Bir daire diliminin alanı, bir merkez açıya karşılık gelecek şekilde A=π.r2.α/360 formülü ile hesaplanmaktadır.

     Yarıçap uzunluğu ile çevreyi hesaplamak için 2 x π x r
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("daire yarıcap girin");
        int yaricap = scan.nextInt();
        double dairealan = Math.PI * yaricap * yaricap;
        int dairecevre= 2*3*yaricap;

        System.out.println("dairealani:"+ dairealan );
        System.out.println("dairecevresi:"+ dairecevre);


    }}



