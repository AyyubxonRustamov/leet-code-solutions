package problems.problem125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    @Test
    void string1_shouldReturn_true() {
        var validPalindrome = new ValidPalindrome(); //problems.problem125
        String string1 = "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(string1));
    }

    @Test
    void string2_shouldReturn_false() {
        var validPalindrome = new ValidPalindrome(); //problems.problem125
        String string2 = "race a car";
        assertFalse(validPalindrome.isPalindrome(string2));
    }

    @Test
    void blank_shouldReturn_true() {
        var validPalindrome = new ValidPalindrome(); //problems.problem125
        String blank = " ";
        assertTrue(validPalindrome.isPalindrome(blank));
    }
}