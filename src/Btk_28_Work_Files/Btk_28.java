package Btk_28_Work_Files;

import java.io.File;
import java.io.IOException;

public class Btk_28 {
    public static void main(String[] args) {
        File file = new File("D:\\ProgramCalismaDosyalari\\Yazilim\\Java\\IntellijProjeler\\Btk_Ace\\src\\Btk_28_Work_Files\\Files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
