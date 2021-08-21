package Btk_27_Throw_Exc;

public class AccountManager {


    private double balance;


    public  void deposit(double amount){
        balance +=amount;
    }

    public void withdraw(double amunt) throws BalanceInsufficentException {
        if (balance >= amunt){
            balance = getBalance() - amunt;
        }
        else {
            throw new BalanceInsufficentException("Bakiye yetersiz.");
        }
    }

    public double getBalance() {
        return balance;
    }

}
