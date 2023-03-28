import java.util.Scanner;

public class TestOverloading1 {
    static void testParameters(int input) {
        System.out.println("The sum of each number for " + input + " is: " +
                ((input % 10) + ((input / 10) % 10) + ((input / 100) % 10)));
    }

    static void testParameters(String str1, String str2) {
        int numberOfLetter = str1.length() + str2.length();
        System.out.println("String Length \"Hello\": " + str1.length() + " symbols");
        System.out.println("String Length \"World!\": " + str2.length() + " symbols");
    }

    static boolean testParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add some number");
        int sum = sc.nextInt();

        if (sum > 0) {
            System.out.println("Number is greater than zero");

            return true;

        } else {
            System.out.println("Number is not greater than zero");

        }
        return false;
    }

    public static void main(String[] args) {
        testParameters(200);
        testParameters(0);
        testParameters();
    }
}