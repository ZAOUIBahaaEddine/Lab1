package EXO6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO6.FizzBuzzRight;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzRightTest {
    private FizzBuzzRight fizzBuzzRightTest;


    @BeforeEach
    void SetUp() {
        fizzBuzzRightTest = new FizzBuzzRight();
    }

    @Test
    public void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzzRightTest.fizzBuzz(-1));
    }


    @Test
    public void testMultiple3() {
        assertEquals("Fizz", fizzBuzzRightTest.fizzBuzz(3));
    }

    @Test
    public void testMultiple5() {
        assertEquals("Buzz", fizzBuzzRightTest.fizzBuzz(5));
    }

    @Test
    public void testMultiple3andMultiple5() {
        assertEquals("FizzBuzz", fizzBuzzRightTest.fizzBuzz(15));
    }

    @Test
    public void testNotAnyMultiple() {
        assertEquals("14", fizzBuzzRightTest.fizzBuzz(14));
    }
}
