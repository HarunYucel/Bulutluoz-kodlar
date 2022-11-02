package Ders25_StatickKeyword;

public class C03_StaticBlocks {

    static {
        System.out.println("1.statik blok calisti");   //static blocks main method'dan önce yazdırır.
    }                                                  // sırasına göre öncelikli olarak hangisi varsa o static blok'u
    public static void main(String[] args) {           // yazdırır.
        System.out.println("main method calisti");
    }
    static {
        System.out.println("2.static block calisti");
    }



}
