import java.util.Arrays;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private String color;

    public Product(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name + " - " + price + " - " + color;
    }

    public static void main(String[] args) {

        String targetColor = "green";

        List<Product> products = Arrays.asList(
                new Product("Mouse", 399.99, "чblack"),
                new Product("Keyboard", 899.99, "green"),
                new Product("Mouse pad", 259.99, "green"),
                new Product("Headphone", 1229.99, "blue"));

        products.stream()
                .filter(product -> product.getColor().equals(targetColor))
                .forEach(System.out::println);
    }
}