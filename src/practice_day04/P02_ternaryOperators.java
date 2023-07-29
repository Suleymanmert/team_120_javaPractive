package practice_day04;

import java.util.Scanner;

public class P02_ternaryOperators {
    public static void main(String[] args) {
        /*
        Soru: kenar degerleri verilen ucgenın ikiz kenar ucgen olup olmadigini
        kontrol edip donut veren kod dizisini yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz ucgenin kenar degrlerini giriniz");
        System.out.print("Kenar-1: ");
        double kenar1=scan.nextDouble();
        System.out.println("kenar-2: ");
        double kenar2=scan.nextDouble();
        System.out.println("Kenar-3: ");
        double kenar3=scan.nextDouble();


        System.out.println(kenar1 > 0 && kenar2 > 0 && kenar3 > 0 ? //bir
                kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3 ? //iki
                        "Girdiğiniz değerler bir ikizkenar üçgene aittir" ://iki
                        "Girdiğiniz üçgen ikizkenar değildir" ://bir
                "Yanlış Değer girdiğiniz ");



    }
}
