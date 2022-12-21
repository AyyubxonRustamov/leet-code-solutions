package problems.problem9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void oneHundredTwentyOneShouldReturnTrue() {
        var solution = new Solution(); //problems.problem9
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void minusOneHundredTwentyOneShouldReturnFalse() {
        var solution = new Solution(); //problems.problem9
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void tenShouldReturnFalse() {
        var solution = new Solution(); //problems.problem9
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void oneThousandTwoHundredTwentyOneShouldReturnTrue() {
        var solution = new Solution(); //problems.problem9
        assertTrue(solution.isPalindrome(1221));
    }

    @Test
    void zeroShouldReturnTrue() {
        var solution = new Solution(); //problems.problem9
        assertTrue(solution.isPalindrome(0));
    }
}