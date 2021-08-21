package Btk_16_Abstr_Dem;

public class CustomerManager {

    BaseDatabaseManager databaseManager ;

    public void getCustomers(){
        databaseManager.getData();
    }
}
