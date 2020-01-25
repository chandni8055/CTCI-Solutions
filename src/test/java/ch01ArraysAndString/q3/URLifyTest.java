package ch01ArraysAndString.q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class URLifyTest {

    @Test
    void makeUrl() {

        String input = "my name is ankit      ";
        String expected = "my%20name%20is%20ankit";

        assertEquals(expected, URLify.makeUrl(input));
    }

    @Test
    void makeUrlUsingReplace() {

        String input = "my name is ankit";
        String expected = "my%20name%20is%20ankit";

        assertEquals(expected, URLify.makeUrlUsingReplace(input));
    }
}