package ch01ArraysAndString.q1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Part1Test {

    @Test
    void hasUniqueCharatersUnoptimized() {

        assertTrue(Part1.hasUniqueCharatersUnoptimized("ankit"));
        assertFalse(Part1.hasUniqueCharatersUnoptimized("ankat"));
    }

    @Test
    void isUniqueCharsOptimized() {
        assertTrue(Part1.isUniqueCharsOptimized("ankit"));
        assertFalse(Part1.isUniqueCharsOptimized("ankat"));
    }
}