package ch01ArraysAndString.q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromePermutationTest {

    @Test
    void isPalindromePermutation() {

        assertTrue(PalindromePermutation.isPalindromePermutation("taco cat"));
        assertFalse(PalindromePermutation.isPalindromePermutation("kumar ankit"));
        assertTrue(PalindromePermutation.isPalindromePermutation("Ratzs live on no evil starz"));
    }
}