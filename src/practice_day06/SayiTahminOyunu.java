package practice_day06;

import java.util.Scanner;

public class SayiTahminOyunu {

     /*
        Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
        Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
        bilince de tebrik edip durduran bir kod yazalim
    */

    public static void main(String[] args) {
        int sayi =138;
        System.out.println("Aklimdan bir sayi tuttum. Hadi Tahmim Et!");
        Scanner scanner=new Scanner(System.in);
        boolean dogruMu=false;
        while (!dogruMu){
            int tahmin=scanner.nextInt();
            if (tahmin>sayi){
                System.out.println("cok soyledin. dusur");
            }else if (tahmin<sayi){
                System.out.println("az soyledin. arttir");
            }else if (tahmin==sayi) {
                System.out.println("tebrikler bildiniz");
                dogruMu=true;
            }else {
                dogruMu=false;
            }


        }

    }

}
