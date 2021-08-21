package Btk_16_Abstr_Dem;

public class Btk_16 {
    public static void main(String[] args) {
        // Design Pattern
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}
