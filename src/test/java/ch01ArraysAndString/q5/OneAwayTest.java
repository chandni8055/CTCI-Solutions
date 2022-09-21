package ch01ArraysAndString.q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneAwayTest {

    @Test
    void areOneEditAway() {
        assertTrue(OneAway.areOneEditAway("pale", "ple"));
        assertTrue(OneAway.areOneEditAway("pales", "pale"));
        assertTrue(OneAway.areOneEditAway("pale", "bale"));
        assertFalse(OneAway.areOneEditAway("pale", "bake"));
    }

    @Test
    void isOneEditAway() {
        assertTrue(OneAway.isOneEditAway("pale", "ple"));
        assertTrue(OneAway.isOneEditAway("pales", "pale"));
        assertTrue(OneAway.isOneEditAway("pale", "bale"));
        assertFalse(OneAway.isOneEditAway("pale", "bake"));

    }
}