package problems.problem13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void III_shouldReturn_three() {
        var romanToInteger = new RomanToInteger(); //problems.problem13
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void LVIII_shouldReturn_fiftyEight() {
        var romanToInteger = new RomanToInteger(); //problems.problem13
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    void MCMXCIV_shouldReturn_oneThousandNineHundredNinetyFour() {
        var romanToInteger = new RomanToInteger(); //problems.problem13
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    void XIX_shouldReturn_twentyNine() {
        var romanToInteger = new RomanToInteger(); //problems.problem13
        assertEquals(19, romanToInteger.romanToInt("XIX"));
    }

    @Test
    void I_shouldReturn_one() {
        var romanToInteger = new RomanToInteger(); //problems.problem13
        assertEquals(1, romanToInteger.romanToInt("I"));
    }
}