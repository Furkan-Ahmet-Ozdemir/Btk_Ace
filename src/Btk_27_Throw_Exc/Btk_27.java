package Btk_27_Throw_Exc;

public class Btk_27 {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap = "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap = "+manager.getBalance());
        try {
            manager.withdraw(101);

        }catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap = "+manager.getBalance());

//        manager.withdraw(20);
        System.out.println("Hesap = "+manager.getBalance());


    }
}
