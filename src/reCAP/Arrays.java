package reCAP;

public class Arrays {
    public static void main(String[] args) {
        /*
        verilen bir array de istenilen elemanin olup plmadigini kontrol edip
        varsa kac kere kullanildigini yazdirin bir method olusturunuz
        {2,3,4,5,6,7,5,8,3,5,7,5,2,5}
         */

        int [] arr={2,3,4,5,6,7,5,8,3,5,7,5,2,15};

        istenenElemaniAra(arr,15);
    }

    private static void istenenElemaniAra(int[] arr, int istenen) {
        int flag=0;

        for (int i = 0; i < arr.length; i++) {
            if (istenen==arr[i]){
                flag++;
            }}
        if (flag!=0){
            System.out.println("Verilen array'de aradığınız "+istenen+" elemanı vardır ve "+flag+" kez kullanılmıştır.");
        }else{
            System.out.println(" Aradığınız "+istenen+" elemanı verilen arrayde bulunmamaktadır.");

        }



    }


}







