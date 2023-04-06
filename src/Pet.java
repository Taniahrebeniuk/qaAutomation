public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet(int eyes) {
        super(eyes);
    }

    public Pet(String name) {
        System.out.println("I am pet");
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet(2);
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet runs « jumps");
    }
}