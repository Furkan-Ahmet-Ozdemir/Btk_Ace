package Btk_2;

import java.io.Console;

public class Btk_2 {
    public static void main(String[] args) {
        int number = 6;   // 28-496
        int total =0;
        // Mükemmel Sayı
        for (int i=1;i<number;i++){
            if (number % i == 0){
                total = total +i;
            }

        }

        if (total == number){
            System.out.println("mÜkemmel");
        }
        else {
            System.out.println("değil");
        }



    }
}
