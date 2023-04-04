package HW4;
public class Employee {
    private int salary;
    public String surname;
    protected int id;

    public Employee(int salary, String surname) {
        this.salary = salary;
        this.surname = surname;
        this.id = 0;
    }

    private Employee(int salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public Employee() {
        this.salary = 0;
        this.id = 0;
        this.surname = " ";
    }

    public void displaySalary() {
        System.out.println("Some salary");
    }

    public void displaySurname() {
        System.out.println("Some surname");
    }

    public void displayId() {
        System.out.println("Some id");
    }

    public static void main(String[] args) {

    }
}