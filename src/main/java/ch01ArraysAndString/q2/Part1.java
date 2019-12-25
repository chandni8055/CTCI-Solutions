package ch01ArraysAndString.q2;

import java.util.Arrays;

/*
check if two strings are permutations of each other
 */
public class Part1 {

    public static Boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1chars = str1.toLowerCase().toCharArray();
        char[] str2chars = str2.toLowerCase().toCharArray();
        Arrays.sort(str1chars);
        Arrays.sort(str2chars);
        return Arrays.equals(str1chars, str2chars);
    }

    public static boolean isPermutationNoDataStructure(String s, String t) {
        if (s.length() != t.length()) return false; // Permutations must be same length

        int[] letters = new int[128]; // Assumption: ASCII
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true; // letters array has no negative values, and therefore no positive values either
    }
}
