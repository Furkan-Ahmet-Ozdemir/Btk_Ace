package Btk_14_Overriding;

public class Btk_14 {
    public static void main(String[] args) {
//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        double a = ogretmenKrediManager.hesapla(1000);
//        System.out.println(a);

        BasrKrediManager[] krediManagers = new BasrKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()
            };
        for (BasrKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }


    }
}