package HM3;

public class Star_pattern1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 4; m >= 1; m--) {
            for (int n = m; n >= 1; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}