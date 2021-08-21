package Btk_32_Thread;

public class Btk_32 {
    public static void main(String[] args) {
        KronometreThread thread1  = new KronometreThread("Thread 1");
        KronometreThread thread2  = new KronometreThread("Thread 2");
        KronometreThread thread3  = new KronometreThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
