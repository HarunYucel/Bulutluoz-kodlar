package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now(); // eşitlik bu şekilde kurulur
        System.out.println(tarih);  // 2022-10-29 //bu günün tarihi
        System.out.println(tarih.minusDays(100)); // 2022-07-21 100 gün önce taril neydi
        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2022-09-21 // 100 hafta ve gün
        System.out.println(tarih.plusMonths(5)
                .plusWeeks(2)
                .plusDays(3)); // 2023-04-15 // ay hafta ve gün önce neydi tarih
    }





}
