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
        String targetColor = "зелений";
        List<Product> products;
        products = Arrays.asList(
                new Product("Мишка", 399.99, "чорний"),
                new Product("Клавіатура", 899.99, "зелений"),
                new Product("Коврик", 259.99, "зелений"),
                new Product("Навушники", 1229.99, "синій"));

        products.stream()
                .filter(product -> product.getColor().equals(targetColor))
                .forEach(System.out::println);
    }
}