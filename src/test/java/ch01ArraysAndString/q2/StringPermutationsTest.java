package ch01ArraysAndString.q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringPermutationsTest {

    @Test
    void isPermutation() {
        assertFalse(StringPermutations.isPermutation("ankit", "ticna"));
        assertTrue(StringPermutations.isPermutation("ankit", "tikna"));
    }

    @Test
    void isPermutationNoDataStructure() {
        assertFalse(StringPermutations.isPermutationNoDataStructure("ankit", "ticna"));
        assertTrue(StringPermutations.isPermutationNoDataStructure("ankit", "tikna"));
    }
}