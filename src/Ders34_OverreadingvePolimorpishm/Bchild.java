package Ders34_OverreadingvePolimorpishm;

public class Bchild extends Aparent{

    public void method1(){
        System.out.println("child class method1");

    }
    public void method2(int a){
        // overriding olabilmesi için
        // hem method ismihem de method signature aynı olmali

        System.out.println("child class method2");

    }

    public void method2(String isim){

        System.out.println("child class String parametreli method");


    }

    @Override
    public void method3() {
       // super.method3();
        // overriding varsa porent ve child classa daki
        // overridden ve overiding method lardan sadece bir çalışır
        // eger ikisini birden calıştırmak isterseniz
        // super overriddenMethoismi yazilir

        /*
        overriddind method notasyonu ile @override ile işaretlenebilir
        @override kullanılmayan overriddig isleminde
        parent class daki overridden method silinirse
        hiçbir sorun olmaz

        Ancak     kullanilan overridding isleminde parent classdaki overridden m
        method silinirse veya signature si degistirilirse java CTE verir böylece
        overridden methodun silinmesi engellenir
         */
    }
}
