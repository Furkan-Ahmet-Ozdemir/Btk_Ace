package Btk_8_Field_Attrib;

public class Btk_8 {
    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price( 5000);
        product.set_stockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());



    }
}
