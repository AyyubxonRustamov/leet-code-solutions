package problems.problem20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    @Test
    void string1_shouldReturn_true() {
        String string1 = "()";
        var validParentheses = new ValidParentheses(); //problems.problem20
        assertTrue(validParentheses.isValid(string1));
    }

    @Test
    void string2_shouldReturn_true() {
        String string2 = "()[]{}";
        var validParentheses = new ValidParentheses(); //problems.problem20
        assertTrue(validParentheses.isValid(string2));
    }

    @Test
    void string3_shouldReturn_false() {
        String string3 = "(]";
        var validParentheses = new ValidParentheses(); //problems.problem20
        assertFalse(validParentheses.isValid(string3));
    }

    @Test
    void string4_shouldReturn_false() {
        String string4 = "({[])}";
        var validParentheses = new ValidParentheses(); //problems.problem20
        assertFalse(validParentheses.isValid(string4));
    }

    @Test
    void string5_shouldReturn_true() {
        String string5 = "([{}])";
        var validParentheses = new ValidParentheses(); //problems.problem20
        assertTrue(validParentheses.isValid(string5));
    }
}