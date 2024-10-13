import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Solution10
 * Test case design principles:
 * 1. Equivalence partitioning: Test various combinations of fractions
 * 2. Boundary value analysis: Test cases with zero, positive, and negative results
 * 3. Special cases: Test single fraction, cancellation, and complex expressions
 */
public class L2022211917_X_Test {

    @Test
    public void testFractionAddition() {
        Solution10 solution = new Solution10();

        // Test case 1: Addition resulting in zero
        assertEquals("0/1", solution.fractionAddition("-1/2+1/2"));

        // Test case 2: Addition of three fractions
        assertEquals("1/3", solution.fractionAddition("-1/2+1/2+1/3"));

        // Test case 3: Subtraction resulting in a negative fraction
        assertEquals("-1/6", solution.fractionAddition("1/3-1/2"));

        // Test case 4: Addition of fractions with different denominators
        assertEquals("7/12", solution.fractionAddition("1/3+1/4"));

        // Test case 5: Addition of negative and positive fractions
        assertEquals("-1/4", solution.fractionAddition("-1/2+1/4"));

        // Test case 6: Addition resulting in a whole number
        assertEquals("1/1", solution.fractionAddition("1/2+1/2"));

        // Test case 7: Addition of small fractions resulting in zero
        assertEquals("0/1", solution.fractionAddition("-1/10+1/10"));

        // Test case 8: Addition of multiple fractions
        assertEquals("3/2", solution.fractionAddition("1/2+1/3+2/3"));

        // Test case 9: Subtraction resulting in a whole negative number
        assertEquals("-1/1", solution.fractionAddition("-5/2+3/2"));

        // Test case 10: Single fraction input
        assertEquals("1/1", solution.fractionAddition("1/1"));
    }
}