package Btk_24_HashMap;

import java.util.Collections;
import java.util.HashMap;

public class Btk_24 {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("ball","top");
        sozluk.put("money","para");
        System.out.println(sozluk);
        System.out.println(sozluk.get("book"));
        sozluk.remove("book");
        System.out.println(sozluk);

        for (String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        sozluk.clear();
        System.out.println(sozluk);

    }
}
