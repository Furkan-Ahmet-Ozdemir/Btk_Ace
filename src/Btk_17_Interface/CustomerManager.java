package Btk_17_Interface;

public class CustomerManager {

    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //  iş kodları
        customerDal.add();
    }

}
