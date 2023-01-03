package problems.problem7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    @Test
    void oneHundredTwentyThree_shouldReturn_threeHundredTwentyOne() {
        var reverseInteger = new ReverseInteger(); //problems.problem7
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    void minusOneHundredTwentyThree_shouldReturn_minusThreeHundredTwentyOne() {
        var reverseInteger = new ReverseInteger(); //problems.problem7
        assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    void oneHundredTwenty_shouldReturn_twentyOne() {
        var reverseInteger = new ReverseInteger(); //problems.problem7
        assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    void integerMaxValue_shouldReturn_zero() {
        var reverseInteger = new ReverseInteger(); //problems.problem7
        assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE));
    }

    @Test
    void integerMinValue_shouldReturn_zero() {
        var reverseInteger = new ReverseInteger(); //problems.problem7
        assertEquals(0, reverseInteger.reverse(Integer.MIN_VALUE));
    }
}