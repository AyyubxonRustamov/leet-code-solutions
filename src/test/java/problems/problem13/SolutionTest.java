package problems.problem13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void III_shouldReturn_three() {
        var solution = new Solution();
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    void LVIII_shouldReturn_fiftyEight() {
        var solution = new Solution();
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    void MCMXCIV_shouldReturn_oneThousandNineHundredNinetyFour() {
        var solution = new Solution();
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }

    @Test
    void XIX_shouldReturn_twentyNine() {
        var solution = new Solution();
        assertEquals(19, solution.romanToInt("XIX"));
    }

    @Test
    void I_shouldReturn_one() {
        var solution = new Solution();
        assertEquals(1, solution.romanToInt("I"));
    }
}