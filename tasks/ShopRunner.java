package tasks;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addProduct(new Shop.Product("phone", 299, 10));
        shop.addProduct(new Shop.Product("TV", 1299, 5));
        shop.addProduct(new Shop.Product("laptop", 799, 7));

        shop.removeProductByName("phone");

        shop.printProduct();
    }
}
