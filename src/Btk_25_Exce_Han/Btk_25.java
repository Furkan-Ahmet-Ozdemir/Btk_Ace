package Btk_25_Exce_Han;

public class Btk_25 {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }
        catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata oluştu.");
            System.out.println(exception);
        }
//        catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Hata oluştu.");
//            System.out.println(exception);
//        }
        catch (Exception exception) {
            System.out.println("Loglandı: "+exception);
        }
        finally {
            // her zaman çalışır
            System.out.println("her türlü");
        }


    }
}
