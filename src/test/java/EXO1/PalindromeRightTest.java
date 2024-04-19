package EXO1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO1.PalindromeRight;



public class PalindromeRightTest {

    private PalindromeRight palindromeRight;
    @BeforeEach
    void SetUp() {
        palindromeRight = new PalindromeRight();
    }


    @Test
    public void testIsPalindrome() {
        assertEquals(true, palindromeRight.isPalindrome("abcdcba"));
    }

    @Test
    public void testIsPalindromeWithOneWord() {
        assertEquals(true, palindromeRight.isPalindrome("aba"));
    }

    @Test
    void testIsPalindromeOriginalWithNullStringShouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> PalindromeRight.isPalindrome(null));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        String nonPalindrome = "abcde";
        assertEquals(false, palindromeRight.isPalindrome(nonPalindrome));
    }
}
