package Btk_5_Metho;

public class Btk_5 {
    public static void main(String[] args) {
        // Variables Arguments
        int a = topla(12,65,65);
        System.out.println(a);
        System.out.println( topla(1,2,3,6));


    }

    public static int topla(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}
