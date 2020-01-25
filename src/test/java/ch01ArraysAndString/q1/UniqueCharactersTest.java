package ch01ArraysAndString.q1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueCharactersTest {

    @Test
    void hasUniqueCharatersUnoptimized() {

        assertTrue(UniqueCharacters.hasUniqueCharatersUnoptimized("ankit"));
        assertFalse(UniqueCharacters.hasUniqueCharatersUnoptimized("ankat"));
    }

    @Test
    void isUniqueCharsOptimized() {
        assertTrue(UniqueCharacters.isUniqueCharsOptimized("ankit"));
        assertFalse(UniqueCharacters.isUniqueCharsOptimized("ankat"));
    }
}