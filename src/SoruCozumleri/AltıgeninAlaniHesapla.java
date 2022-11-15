package SoruCozumleri;

public class AltıgeninAlaniHesapla {

    public static void main(String[] args) {

        /*  Bir altıgenin alanını hesaplayan bir Java programı yazın. editöre git
Altıgenin alanı = (6 * s^2)/(4*tan(π/6))
s bir kenar uzunluğudur
Giriş Verileri:
Altıgenin bir kenar uzunluğunu girin: 6
Beklenen çıktı   Altıgenin alanı: 93.53074360871938

         */
        //(6*(s*s))/(4*Math.tan(Math.PI/6));

        int Altıgenbirkenaruzunluk = 5;

        double AltıgenAlan= (6*5*5) / 4*Math.tan(Math.PI/6);

        System.out.println(AltıgenAlan);




    }
}
