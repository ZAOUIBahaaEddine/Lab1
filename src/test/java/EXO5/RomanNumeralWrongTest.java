package EXO5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO5.RomanNumeralRight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralWrongTest {
    private RomanNumeralRight romanNumeralRight;

    @BeforeEach
    void SetUp() {
        romanNumeralRight = new RomanNumeralRight();
    }

    @Test
    void testRomanNumeralGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralRight.toRoman(564651));
    }

    @Test
    void testRomanNumeralLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralRight.toRoman(-22135));
    }

    @Test
    void testRomanNumeralTen() {
        String expected = "X";
        String returned = RomanNumeralRight.toRoman(10);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralNine() {
        String expected = "IX";
        String returned = RomanNumeralRight.toRoman(9);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralEight() {
        String expected = "VIII";
        String returned = RomanNumeralRight.toRoman(8);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralFourteen() {
        String expected = "XIV";
        String returned = RomanNumeralRight.toRoman(14);
        assertEquals(expected, returned);
    }

}
