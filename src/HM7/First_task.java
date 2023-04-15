package HM7;

public class First_task {
    public static void divideArray(int[] arr) {
        int[] initialArray = new int[arr.length];

        try {
            for (int i = 0; i < arr.length; i++) {
                initialArray[i] = arr[i] / 0;
                System.out.print(initialArray[i] + "Result");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception was found: Division by zero is not allowed");
        }
    }

    public static void main(String[] args) {
        int arr[] = {25, 45, 55, 75, 95};
        divideArray(arr);
    }
}