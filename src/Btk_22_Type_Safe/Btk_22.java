package Btk_22_Type_Safe;

import java.util.ArrayList;
import java.util.Collections;

public class Btk_22 {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İzmir");
        sehirler.add("Adana");
        sehirler.add("Bursa");

        Collections.sort(sehirler);
        System.out.println(sehirler);





    }
}
