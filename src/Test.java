public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Baxter");
        System.out.println("Dog has " + dog.paw + " paws");

        Cat cat = new Cat("Felix");
        cat.sleep();
    }
}