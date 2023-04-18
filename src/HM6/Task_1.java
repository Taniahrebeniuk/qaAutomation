package HM6;

public class Task_1 {
    public static void smallestValueOfModNumbers(int[] arr) {
        int minModuleDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int moduleDiff = Math.abs(arr[i] - arr[j]);
                if (moduleDiff < minModuleDiff) {
                    minModuleDiff = moduleDiff;
                }
            }
        }
        System.out.println();
        System.out.println("The smallest value of the difference between the numbers of modules is " + minModuleDiff);
    }

    public static void main(String[] args) {
        int arr[] = {5, 11, 7, 20};
        smallestValueOfModNumbers(arr);
    }
}