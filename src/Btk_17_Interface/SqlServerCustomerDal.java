package Btk_17_Interface;

public class SqlServerCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Sql Server eklendi.");
    }
}
