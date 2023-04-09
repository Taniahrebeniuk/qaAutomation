import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Book_list {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Jane Eyre");
        books.add("The western front without changes");
        books.add("To Kill a Mockingbird");
        books.add("Flowers for Algernon");
        books.add("Catcher in the rye");

        Map<Integer, String> bookMap = convertBooksToMap(books);
        System.out.println(bookMap);
    }

    public static Map<Integer, String> convertBooksToMap(ArrayList<String> books) {
        Map<Integer, String> bookMap = new HashMap<Integer, String>();

        for (int i = 0; i < books.size(); i++) {
            bookMap.put(i, books.get(i));
        }
        return bookMap;
    }
}