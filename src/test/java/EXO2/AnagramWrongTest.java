package EXO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO2.AnagramWrong;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramWrongTest {
    private AnagramWrong anagramWrong;
    @BeforeEach
    void SetUp() {
        anagramWrong = new AnagramWrong();
    }


    @Test
    public void testIsAnagram() {
        assertEquals(true, anagramWrong.isAnagram("abcd", "abcd"));
    }

    @Test
    public void testNotTheSameLength() {
        assertFalse(anagramWrong.isAnagram("abcdef", "abcd"));
    }

    @Test
    void testBothNULL() {
        assertThrows(NullPointerException.class, () -> anagramWrong.isAnagram(null, null));
    }

    @Test
    void testFirstIsNULL() {
        assertThrows(NullPointerException.class, () -> AnagramWrong.isAnagram(null, "bahaa"));
    }

    @Test
    void testSecondIsNULL() {
        assertThrows(NullPointerException.class, () -> AnagramWrong.isAnagram("bahaa", null));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(anagramWrong.isAnagram("abcdef", "abcddddddd"));
    }

}
