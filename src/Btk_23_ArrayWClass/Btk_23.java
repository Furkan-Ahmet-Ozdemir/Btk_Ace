package Btk_23_ArrayWClass;

import java.util.ArrayList;

public class Btk_23 {
    public static void main(String[] args) {

        ArrayList<Customer> customers  =new ArrayList<Customer>();

        customers.add(new Customer(1,"Mehmet","afasffa"));
        customers.add(new Customer(2,"Ahmet","Yıldırım"));
        customers.add(new Customer(3,"Deli","Kar"));
        customers.remove(0);
       for (Customer customer:customers){
           System.out.println(customer.firstName);
       }

    }
}
