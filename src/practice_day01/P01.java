package practice_day01;

public class P01 {
    public static void main(String[] args) {

       System.out.println("Merhaba Java");
       System.out.println("Hello World"); // println foksiyonu verilen string ifadeyi yazdirip bir alt satira gecer
       System.out.print("yazdirma fonksiyonu-");// print fonksiyonu verilen string ifadeyi yazdirir ve alt satira gecmez
       System.out.println("merhaba");

        // Bu işareti tek satırlık yorum için kullanılır

        /*
        Birde fazla satirlik yorum yazmak gerekirse
        bu sekilde kullanim yapilmalidir
         */

        // soru : Konsola "Hello Java Ben Geldim" yazdirilir

        System.out.println("Hello Java Ben Geldim");
        System.out.println("\"Hello Java Ben Geldim\"");

        /*
        \":Cift tirnak isareti yazdirir
        \': Tek tirnak isareti yazdirir
        \n: kendinden sonra gelen metni bir alt satirdan baslatir.
        \t:hendinden sonra bir TAB bosluk birakir
         */

        System.out.println("\'Hello Wise\'");
        System.out.println();
        System.out.println("Hello Wise\nHave a nice day!");
        System.out.println("Hello Java \rSEn neymissin be abi!");
        System.out.println();
        System.out.println("Hello Wise\t\t\tHello Future");

        /* soru-2: Konsola
        Deger atayarak
        Ramazan TANHAN - Software Development Engineer in TEST
         */

        /*
        Javada variable degiskenler vardir
        Primitive - Non Primitive
         */

        String name = "Süleyman ";
        String surname = "MERT ";
        String job = "- Software Development Engineer in TEST ";
        System.out.println(name+" " + surname+" "  +job );

        /*
        ÖDEV SORUSU: Asagidaki gibi bir ATM Karsilama Ekrani Hazirlayip yazdiriniz

         WISE ATM'YE HOŞGELDİNİZ
    1 – Bakiye Sorgulama
    2 – Para Yatırma
    3 – Para Çekme
    4 – Bilgi Güncelleme
    5 – Kart İade
**********  WISE BANK   **********
         */

        // SDLC - Software Development Lİfe Cycle ( Yazilim Gelistirme Yasam Döngüsü)
        // STLC -Software Test Lİfe Cycle ( Yazilim Gelistirme Yasam Döngüsü)

        // Ekranda bir bolumun fotosunu almak
        // Windows: Win+shift+S
        // Mac : Cmd+shift+4S




    }

}
