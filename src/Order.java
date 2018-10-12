import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static int id;


    private List<Product> products = new ArrayList<>();

    public Order() {
        id++;
    }

    public static int getId() {
        return id;
    }

    public List<Product> addProduct(Product product) {
        products.add();
        return products;
    }

    public BigDecimal calculatePrice() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            sum = sum.add(product.getPrice());
        }
        return sum;
    }

    public void printOrder() {
        System.out.println("Order number is: " + id);
        for (Product product : products) {
            System.out.println(product.getName());
        }
        System.out.println("Total price is " + calculatePrice());
    }
}
