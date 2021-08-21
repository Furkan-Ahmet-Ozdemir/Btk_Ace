package Btk_19_Static;

public class Btk_19 {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 23;
        product.name= "yrtytr";

        manager.add(product);
    }
}
