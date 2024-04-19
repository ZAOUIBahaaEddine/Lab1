package EXO1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO1.PalindromeWrong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PalindromeWrongTest {

    private PalindromeWrong palindromeWrong;
    @BeforeEach
    void SetUp() {
        palindromeWrong = new PalindromeWrong();
    }


    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindromeWrong.isPalindrome("abcdcba"));
    }

    @Test
    public void testIsPalindromeWithOneWord() {
        assertEquals(true, palindromeWrong.isPalindrome("aba"));
    }

    @Test
    void testIsPalindromeOriginalWithNullStringShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> PalindromeWrong.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        String nonPalindrome = "abcde";
        assertEquals(false, palindromeWrong.isPalindrome(nonPalindrome));
    }
}
