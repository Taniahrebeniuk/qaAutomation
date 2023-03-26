import java.util.Scanner;

public class TestOverloading1 {

    static void testParameters(float a, float b, float c) {
        float i = a + b + c;
        System.out.println(i);
    }

    static void testParameters(String str1, String str2) {
        int numberOfLetter = str1.length() + str2.length();
        System.out.println("String Length \"Hello\": " + str1.length() + " symbols");
        System.out.println("String Length \"World!\": " + str2.length() + " symbols");

    }

    static void testParameters(int value) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add some value");
        int sum = sc.nextInt();
        if (sum > 0) {
            System.out.println("true");
        } else if (sum <= 0) {
            System.out.println("false");
        }

    }


    public static void main(String[] args) {
        testParameters(5, 10, 15);
        testParameters("Hello", "World!");
        testParameters(1);
    }

}