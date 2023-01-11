package problems.problem12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanTest {

    @Test
    void three_shouldReturn_III() {
        var integerToRoman = new IntegerToRoman(); //problems.problem12
        assertEquals("III", integerToRoman.intToRoman(3));
    }

    @Test
    void fiftyEight_shouldReturn_LVIII() {
        var integerToRoman = new IntegerToRoman(); //problems.problem12
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    void oneThousandNineHundredNinetyFour_shouldReturn_MCMXCIV() {
        var integerToRoman = new IntegerToRoman(); //problems.problem12
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

    @Test
    void threeThousandNineHundredNinetyNine_shouldReturn_MCMXCIV() {
        var integerToRoman = new IntegerToRoman(); //problems.problem12
        assertEquals("MMMCMXCIX", integerToRoman.intToRoman(3999));
    }
}