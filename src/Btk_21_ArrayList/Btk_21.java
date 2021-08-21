package Btk_21_ArrayList;

import java.util.ArrayList;
public class Btk_21 {
    public static void main(String[] args) {
        // type not safe
        ArrayList sayilar = new ArrayList();

        sayilar.add(12);
        sayilar.add(123);
        sayilar.add("şsgçsegdf");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2)); // değeri alma
        sayilar.set(2,"lgşsrşlisgd"); // değer değiştirme
        System.out.println(sayilar.get(2));
        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.clear(); // tüm elemanları siler

        for (Object i:sayilar ){
            System.out.println(i);
        }






    }
}
