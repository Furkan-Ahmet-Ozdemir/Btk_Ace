package Btk_17_Interface;

public class MySqlCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("My sql eklendi.");
    }
}
