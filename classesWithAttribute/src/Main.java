public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "MSI", 1500.0, "Laptop" , 5, "Black" );

        System.out.println(product.getName());



        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());
    }
}