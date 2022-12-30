package problems.problem66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    @Test
    void oneTwoThree_shouldReturn_oneTwoFour() {
        var plusOne = new PlusOne(); //problems.problem66
        int[] digits = {1, 2, 3}, expected = {1, 2, 4};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    void fourThreeTwoOne_shouldReturn_fourThreeTwoTwo() {
        var plusOne = new PlusOne(); //problems.problem66
        int[] digits = {4, 3, 2, 1}, expected = {4, 3, 2, 2};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    void nine_shouldReturn_oneZero() {
        var plusOne = new PlusOne(); //problems.problem66
        int[] digits = {9}, expected = {1, 0};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }
}