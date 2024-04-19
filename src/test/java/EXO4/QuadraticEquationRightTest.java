package EXO4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaaeddine.EXO4.QuadraticEquationRight;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationRightTest {

    private QuadraticEquationRight quadraticEquationRight;

    @BeforeEach
    void SetUp() {
        quadraticEquationRight = new QuadraticEquationRight();
    }

    @Test
    void testUsingAEqualsZero() {
        double a = 0;
        double b = 2;
        double c = 3;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquationRight.solve(a, b, c));
    }

    @Test
    void testUsingDeltaLessThanZero() {
        double a = 1;
        double b = 1;
        double c = 1;
        double[] roots = QuadraticEquationRight.solve(a, b, c);
        assertNull(roots);
    }

    @Test
    void testUsingDeltaEqualsZero() {
        double a = 1;
        double b = 2;
        double c = 1;
        double[] roots = QuadraticEquationRight.solve(a, b, c);
        assertArrayEquals(new double[]{-b / (2 * a)}, roots);
    }

    @Test
    void testUsingDeltaGreaterThanZero() {
        double a = 1;
        double b = 4;
        double c = 3;
        double[] roots = QuadraticEquationRight.solve(a, b, c);
        assertArrayEquals(new double[]{(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a), (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)}, roots);
    }


}
