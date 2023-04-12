public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: " + name);
    }
    public void play() {
        System.out.println("Dog plays");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Keks");
    }
}