package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatement {
    public static void main(String[] args) {
        /*
        Soru: kenar degerleri girilen bir ucgenin dik ucgen olup olmadigini
         kontrol edip
         donut veren kod dizisini yaziniz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol edilecek ucgenin kenarlarinin uzunluklarini giriniz");
        System.out.println("Birinci kenarin uzunluklari");
        int a=scan.nextInt();
        System.out.println("ikinci kenar uzunluklari");
        int b=scan.nextInt();
        System.out.println("ucuncu kenar uzunluklari");
        int c= scan.nextInt();

        System.out.println("==========================1. Cozom===============");

        if ((a*a)+(b*b)==(c*c)) {
            System.out.println("girdiginiz degerlere sahip ucgen dik ucgendir");
        }else if ((a*a)+(c*c)==(b*b)) {
            System.out.println("girdiginiz degerlere sahip ucgen dik ucgendir");
        }else if ((b*b)+(c*c)==(a*a)){
            System.out.println("girdiginiz degerlere sahip ucgen dik ucgendir");
        }else {
            System.out.println("girdiginiz degerlere sahip ucgen bir dik ucgen degildir");
        }
        System.out.println("==========================2. Cozom===============");
        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
            /*
             ||:OR (VEYA) işareti ile yazılanlardan sadece birinin doğrulanması yeterlidir.
             &&: AND (VE) işareti ile yazılanların tamamı doğru olması gerekir
             */
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir.");
        } else {
            System.out.println("Girdiğiniz değerlere sahip bir üçgen dik üçgen değildir");
        }
        // CI-CD: Contunie Integration

        }
    }

