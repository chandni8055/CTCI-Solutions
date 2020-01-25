package ch01ArraysAndString.q1;


import java.util.HashSet;
import java.util.Set;

/*
Implement an algorithm to determine if a string has all unique characters.
 */
public class UniqueCharacters {

    public static Boolean hasUniqueCharatersUnoptimized(String str) {

        Set<Character> uniqueCharecters = new HashSet<>();
        for (Character ch : str.toCharArray()) {
            uniqueCharecters.add(ch);
        }
        return str.length() == uniqueCharecters.size();
    }

    public static boolean isUniqueCharsOptimized(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
