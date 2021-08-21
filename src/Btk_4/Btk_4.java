package Btk_4;

public class Btk_4 {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 1;

        for (int sayi:sayilar){
            if (sayi == aranacak){
                System.out.println("Buldum" + sayi);
                break;
            }
        }


        ssayiBulmaca();

    }

    public static void ssayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 1;

        for (int sayi:sayilar){
            if (sayi == aranacak){
                System.out.println("Buldum" + sayi);
                break;
            }
        }
    }

    public static void mesajVer(int aranacak){
        System.out.println();
    }


}
