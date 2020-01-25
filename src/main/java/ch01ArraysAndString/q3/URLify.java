package ch01ArraysAndString.q3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/*
write a method to replace all the spaces in a string wit %20.
Eg: input:  "my new website is awesome        "
    output: "my%20new%20website%20is%20awesome"
 */

public class URLify {

    public static String makeUrlUsingReplace(String text) {
        return text.replace(" ", "%20");
    }

    public static String makeUrl(String text) {
        char[] chars = text.trim().toCharArray();
        ArrayList<Character> url = new ArrayList<>();
        for (Character c : chars) {
            if (c == ' ') {
                url.add('%');
                url.add('2');
                url.add('0');
            } else {
                url.add(c);
            }
        }
        return url.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
