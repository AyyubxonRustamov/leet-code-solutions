package problems.problem9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @Test
    void oneHundredTwentyOneShouldReturnTrue() {
        var palindromeNumber = new PalindromeNumber(); //problems.problem9
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void minusOneHundredTwentyOneShouldReturnFalse() {
        var palindromeNumber = new PalindromeNumber(); //problems.problem9
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void tenShouldReturnFalse() {
        var palindromeNumber = new PalindromeNumber(); //problems.problem9
        assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    void oneThousandTwoHundredTwentyOneShouldReturnTrue() {
        var palindromeNumber = new PalindromeNumber(); //problems.problem9
        assertTrue(palindromeNumber.isPalindrome(1221));
    }

    @Test
    void zeroShouldReturnTrue() {
        var palindromeNumber = new PalindromeNumber(); //problems.problem9
        assertTrue(palindromeNumber.isPalindrome(0));
    }
}