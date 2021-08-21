package Btk_29_Files;

import java.io.*;
import java.util.Scanner;

public class Btk_29 {
    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();

    }

    public static void createFile(){
        File file = new File("D:\\ProgramCalismaDosyalari\\Yazilim\\Java\\IntellijProjeler\\Btk_Ace\\src\\Btk_29_Files\\Files\\students.txt");
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

    public static void getFileInfo(){
        File file = new File("D:\\ProgramCalismaDosyalari\\Yazilim\\Java\\IntellijProjeler\\Btk_Ace\\src\\Btk_29_Files\\Files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı : "+file.getName());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi ? "+file.canWrite());
            System.out.println("Dosya okunabilir mi ? "+file.canRead());
            System.out.println("Dosya boyutu (byte) : "+file.length());
        }
    }

    public static void readFile(){
        File file = new File("D:\\ProgramCalismaDosyalari\\Yazilim\\Java\\IntellijProjeler\\Btk_Ace\\src\\Btk_29_Files\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        // append true olursa var olan dosyanını içeriğini korur sonuuna yazar
        try {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("D:\\ProgramCalismaDosyalari\\Yazilim\\Java\\IntellijProjeler\\Btk_Ace\\src\\Btk_29_Files\\Files\\students.txt",true));
            writer.newLine();
            writer.write("Merttttttt");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
