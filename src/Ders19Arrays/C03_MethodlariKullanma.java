package Ders19Arrays;

import Ders18Arrays.C03ArrayArtirma;
import Ders18Arrays.C05ArraydeElemanarama;
import Ders18Arrays.C07KullaniniyaArrayolusturma;
import Ders18Arrays.C08_ElementleriToplama;

import java.util.Arrays;

public class C03_MethodlariKullanma {

    public static void main(String[] args) {
        // verilen bir int array'in elementlerini 2 artirin

        int[] arr= {2,3,4};
        arr=C03ArrayArtirma.elementleri2artir(arr);
        System.out.println(Arrays.toString(arr));
        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C08_ElementleriToplama.pozitifElementleriTopla(arr));
        // arr array'inde 10 element olarak var mi ?
        C05ArraydeElemanarama.elemanAra(arr,10);
        // kullanicidan deger alarak bir array olusturun

        int[] yeniarrr= C07KullaniniyaArrayolusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniarrr));



    }
}
