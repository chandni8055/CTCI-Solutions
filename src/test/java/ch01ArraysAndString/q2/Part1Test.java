package ch01ArraysAndString.q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Part1Test {

    @Test
    void isPermutation() {
        assertFalse(Part1.isPermutation("ankit", "ticna"));
        assertTrue(Part1.isPermutation("ankit", "tikna"));
    }

    @Test
    void isPermutationNoDataStructure() {
        assertFalse(Part1.isPermutationNoDataStructure("ankit", "ticna"));
        assertTrue(Part1.isPermutationNoDataStructure("ankit", "tikna"));
    }
}