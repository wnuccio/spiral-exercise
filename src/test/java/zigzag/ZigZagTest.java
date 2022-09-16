package zigzag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagTest {
    @Test
    void convert_on_one_row() {
        assertEquals("A", new ZigZag("A", 1).convert());
        assertEquals("AB", new ZigZag("AB", 1).convert());
        assertEquals("ABC", new ZigZag("ABC", 1).convert());
        assertEquals("ABCD", new ZigZag("ABCD", 1).convert());
    }

    @Test
    void convert_when_letters_are_not_more_than_rows() {
        assertEquals("A", new ZigZag("A", 1).convert());
        assertEquals("A", new ZigZag("A", 2).convert());
        assertEquals("AB", new ZigZag("AB", 2).convert());
        assertEquals("AB", new ZigZag("AB", 3).convert());
        assertEquals("ABC", new ZigZag("ABC", 3).convert());
        assertEquals("ABC", new ZigZag("ABC", 4).convert());
    }

    /*
        1 3
        2
     */
    @Test
    void convert_three_letters_on_two_rows() {
        String result = new ZigZag("ABC", 2).convert();

        assertEquals("ACB", result);
    }

}