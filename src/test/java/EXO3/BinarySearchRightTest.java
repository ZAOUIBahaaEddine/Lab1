package EXO3;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO3.BinarySearchRight;

public class BinarySearchRightTest {

    private BinarySearchRight binarySearchRight;
    @BeforeEach
    void SetUp() {
        binarySearchRight = new BinarySearchRight();
    }



    @Test
    void testArrayIsNULL() {
        Array a = null;
        assertThrows(NullPointerException.class, () -> BinarySearchRight.binarySearch(null, 5));
    }

    @Test
    void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 3;
        int index = BinarySearchRight.binarySearch(array, element);
        Assertions.assertEquals(2, index);
    }

    @Test
    void testElementNotInTheArray() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;
        int index = BinarySearchRight.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testMidofArrayGreaterThanElement() {
        // To Rename later
        int[] array = {1, 2, 3, 4, 5};
        int element = 2;
        int index = BinarySearchRight.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }
}

