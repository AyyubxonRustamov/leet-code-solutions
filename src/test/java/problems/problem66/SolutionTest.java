package problems.problem66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void oneTwoThree_shouldReturn_oneTwoFour() {
        var solution = new Solution(); //problems.problem66
        int[] digits = {1, 2, 3}, expected = {1, 2, 4};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void fourThreeTwoOne_shouldReturn_fourThreeTwoTwo() {
        var solution = new Solution(); //problems.problem66
        int[] digits = {4, 3, 2, 1}, expected = {4, 3, 2, 2};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    void nine_shouldReturn_oneZero() {
        var solution = new Solution(); //problems.problem66
        int[] digits = {9}, expected = {1, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }
}