package problems.problem14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void flowerFlowFlight_shouldReturn_fl() {
        var solution = new Solution(); //problems.problem14
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    void dogRacecarCar_shouldReturn_emptyString() {
        var solution = new Solution(); //problems.problem14
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    void emptyArray_shouldReturn_emptyString() {
        var solution = new Solution(); //problems.problem14
        String[] strs = {};
        assertEquals("", solution.longestCommonPrefix(strs));
    }
}