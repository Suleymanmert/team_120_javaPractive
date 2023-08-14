package reCAP;

import java.util.Scanner;

public class DataCasting {
    public static void main(String[] args) {


    /*
    Kullanicidan bir harf girmesini isteyip o harften gelen üç harfi yazdiralim
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiğiniz harten sonra gelen harfler sırasıyla " + ((char) (harf + 1)) + "," + ((char) (harf + 2)) + "," + ((char) (harf + 3)) + "'dir.");
    }

}
