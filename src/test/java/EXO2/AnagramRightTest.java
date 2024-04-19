package EXO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO2.AnagramRight;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramRightTest {
    private AnagramRight anagramRight;
    @BeforeEach
    void SetUp() {
        anagramRight = new AnagramRight();
    }


    @Test
    public void testIsAnagram() {
        assertEquals(true, anagramRight.isAnagram("abcd", "abcd"));
    }

    @Test
    public void testNotTheSameLength() {
        assertFalse(anagramRight.isAnagram("abcdef", "abcd"));
    }

    @Test
    void testBothNULL() {
        assertThrows(NullPointerException.class, () -> AnagramRight.isAnagram(null, null));
    }

    @Test
    void testFirstIsNULL() {
        assertThrows(NullPointerException.class, () -> AnagramRight.isAnagram(null, "bahaa"));
    }

    @Test
    void testSecondIsNULL() {
        assertThrows(NullPointerException.class, () -> AnagramRight.isAnagram("bahaa", null));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(anagramRight.isAnagram("abcdef", "abcddddddd"));
    }

}
