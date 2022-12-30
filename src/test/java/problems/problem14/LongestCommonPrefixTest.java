package problems.problem14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void flowerFlowFlight_shouldReturn_fl() {
        var longestCommonPrefix = new LongestCommonPrefix(); //problems.problem14
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void dogRacecarCar_shouldReturn_emptyString() {
        var longestCommonPrefix = new LongestCommonPrefix(); //problems.problem14
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void emptyArray_shouldReturn_emptyString() {
        var longestCommonPrefix = new LongestCommonPrefix(); //problems.problem14
        String[] strs = {};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
    }
}