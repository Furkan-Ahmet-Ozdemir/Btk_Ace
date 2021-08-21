package Btk_30_Generics;

import java.util.ArrayList;

public class Btk_30 {
    public static void main(String[] args) {
        // ArrayList<String> sehirler = new ArrayList<>();  aşağıdaki ile aynı işi yapar
        MyList<String> sehirler = new MyList<String>();
        sehirler.add("Awdas");
       // sehirler.add(1);

    }
}
