import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.QuadraticEquation;
import org.zaouibahaaeddine.RomanNumeral;

public class RomanNumeralTest {
    private RomanNumeral romanNumeral;

    @BeforeEach
    void SetUp() {
        romanNumeral = new RomanNumeral();
    }

    @Test
    void testRomanNumeralGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(564651));
    }

    @Test
    void testRomanNumeralLessThan1() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-22135));
    }

    @Test
    void testRomanNumeralCasual() {
        String expected = "X";
        String returned = RomanNumeral.toRoman(10);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralCasual2() {
        String expected = "IX";
        String returned = RomanNumeral.toRoman(9);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralCasual3() {
        String expected = "VIII";
        String returned = RomanNumeral.toRoman(8);
        assertEquals(expected, returned);
    }

    @Test
    void testRomanNumeralCasual4() {
        String expected = "XIV";
        String returned = RomanNumeral.toRoman(14);
        assertEquals(expected, returned);
    }



}
