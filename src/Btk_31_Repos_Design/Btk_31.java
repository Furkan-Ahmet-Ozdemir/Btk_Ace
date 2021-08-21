package Btk_31_Repos_Design;

public class Btk_31 {
    public static void main(String[] args) {
        Validator  validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}
