package Btk_17_Interface;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }
}
