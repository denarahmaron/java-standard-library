package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Denar Ahmaron Surya Gemilang";

        Pattern pattern = Pattern.compile("[a-zA-Z]*e[a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while(matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
