package practice_day05;

import java.util.Scanner;

public class CokDahaBasit_forLop {

    /*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */

    public static void main(String[] args) {

        Scanner wise=new Scanner(System.in);
        System.out.println("Baslangic Degerini Giriniz: ");
        int basDeger=wise.nextInt();
        System.out.println("Bitis Degerini Giriniz: ");
        int bitDeger=wise.nextInt();

        int toplam=0;
        if (basDeger>bitDeger){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
        }else {
            for (int i = basDeger; i <=bitDeger; i++) {

            }
        }
    }

}
