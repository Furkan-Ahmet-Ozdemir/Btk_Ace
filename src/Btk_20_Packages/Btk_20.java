package Btk_20_Packages;

import Btk_20_Packages.matematik.DortIslem; //  Btk_20_Packages.matematik.*; yazarsan paketin içindeki herşey  gelir

import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Btk_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınız giriniz.");
        int sayi = scanner.nextInt();

        System.out.println(sayi);

        DortIslem dortIslem = new DortIslem();
        int a = dortIslem.topla(14,36);
        System.out.println(a);
    }
}
