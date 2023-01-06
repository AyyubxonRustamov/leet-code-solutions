package problems.problem1945;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsOfStringAfterConvertTest {

    @Test
    void getLucky_s_equals_iiii_k_equals_one_shouldReturn_thirtySix() {
        var sum = new SumOfDigitsOfStringAfterConvert(); //problems.problem1945
        assertEquals(36, sum.getLucky("iiii", 1));
    }

    @Test
    void getLucky_s_equals_leetcode_k_equals_two_shouldReturn_six() {
        var sum = new SumOfDigitsOfStringAfterConvert(); //problems.problem1945
        assertEquals(6, sum.getLucky("leetcode", 2));
    }

    @Test
    void getLucky_s_equals_zbax_k_equals_two_shouldReturn_eight() {
        var sum = new SumOfDigitsOfStringAfterConvert(); //problems.problem1945
        assertEquals(8, sum.getLucky("zbax", 2));
    }
}