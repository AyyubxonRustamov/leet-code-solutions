package problems.problem58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void helloWorld_shouldReturn_five() {
        String s = "Hello World";
        var solution = new Solution(); //problems.problem58
        assertEquals(5, solution.lengthOfLastWord(s));
    }

    @Test
    void flyMeToTheMoon_shouldReturn_four() {
        String s = "   fly me   to   the moon  ";
        var solution = new Solution(); //problems.problem58
        assertEquals(4, solution.lengthOfLastWord(s));
    }

    @Test
    void luffyIsStillJoyboy_shouldReturn_six() {
        String s = "luffy is still joyboy";
        var solution = new Solution(); //problems.problem58
        assertEquals(6, solution.lengthOfLastWord(s));
    }

}