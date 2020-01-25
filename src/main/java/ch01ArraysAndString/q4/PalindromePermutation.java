package ch01ArraysAndString.q4;

/*
 * Given a string, write a function to check if it is permutation of a palindrome.
 * Palindrome doesn't need to be a dictionary word.
 * */

import java.util.HashMap;

public class PalindromePermutation {

    public static Boolean isPalindromePermutation(String words) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (Character c : words.toLowerCase().toCharArray()) {
            if (characterIntegerHashMap.containsKey(c)) {
                Integer count = characterIntegerHashMap.get(c);
                count++;
                characterIntegerHashMap.put(c, count);
            } else {
                characterIntegerHashMap.put(c, 1);
            }

        }
        characterIntegerHashMap.remove(' ');
        long countOfOddOccurences = characterIntegerHashMap.values().stream().filter(i -> i % 2 == 1).count();
        return countOfOddOccurences < 2;
    }
}
