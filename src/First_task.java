public class First_task {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hi";
        String c = "Greetings";

        if (a.length() > b.length() && a.length() > c.length()) {
            System.out.println(a + " word is the largest");
        } else {
            if (b.length() > a.length() && b.length() > c.length()) {
                System.out.println(b + " word is the largest");
            } else {
                if (c.length() > a.length() && c.length() > b.length()) {
                    System.out.println(c + " word is the largest");
                } else {
                    System.out.println("Another word is the largest one");
                }
            }
        }
    }
}