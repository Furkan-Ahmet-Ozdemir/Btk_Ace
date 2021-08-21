package Btk_17_Interface;

public class Btk_17 {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();




    }
}
