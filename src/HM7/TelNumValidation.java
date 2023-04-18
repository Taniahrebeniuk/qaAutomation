package HM7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelNumValidation {
    public static void main(String[] args) {
        List<String> mobileNumbers = new ArrayList<>();
        mobileNumbers.add("+380634576123");
        mobileNumbers.add("380634576123");
        mobileNumbers.add("+23940302503");
        validateUkrainianNumbers(mobileNumbers);
    }

    public static void validateUkrainianNumbers(List<String> mobileNumbers) {
        String regex = "^\\+380\\d{9}$";
        Pattern pattern = Pattern.compile(regex);

        for (String mobnumber : mobileNumbers) {
            Matcher matcher = pattern.matcher(mobnumber);
            System.out.println(mobnumber + " : " + matcher.matches());
        }
    }
}