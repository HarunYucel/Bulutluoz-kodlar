package Ders34_OverreadingvePolimorpishm;

public class Dchild extends Cparent{

    //overridding kuralları
    //1 acces modifier method signatureye dahil olmadiğindan
    //  overridden ve overridding acces madifierlar farkli olabilir.
    // chid parenti sınırlandıramaz
    // yani overridding method un acces modifieri ayni veya daha geniş kapsamlı olmalidir
    // private -- default -- protected-- public


     void method1 (){



    }

    protected static void  method2(){}
    //2- private ve static methodlar override edilemez
    private void method3 () {}


}
