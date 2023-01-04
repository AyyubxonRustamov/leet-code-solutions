package problems.problem69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrtXTest {

    @Test
    void four_shouldReturn_two() {
        var sqrtX = new SqrtX(); //problems.problem69
        assertEquals(2, sqrtX.mySqrt(4));
    }

    @Test
    void eight_shouldReturn_two() {
        var sqrtX = new SqrtX(); //problems.problem69
        assertEquals(2, sqrtX.mySqrt(8));
    }

    @Test
    void zero_shouldReturn_zero() {
        var sqrtX = new SqrtX(); //problems.problem69
        assertEquals(0, sqrtX.mySqrt(0));
    }

    @Test
    void one_shouldReturn_one() {
        var sqrtX = new SqrtX(); //problems.problem69
        assertEquals(1, sqrtX.mySqrt(1));
    }

    @Test
    void integerMaxValue_shouldReturn_fortySixThousandThreeHundredForty() {
        var sqrtX = new SqrtX(); //problems.problem69
        assertEquals(46340, sqrtX.mySqrt(Integer.MAX_VALUE));
    }
}