public class Animal {
    private Animal(int eyes) {
        this.eyes = eyes;
    }

    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}