package problems.problem58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    @Test
    void helloWorld_shouldReturn_five() {
        String s = "Hello World";
        var lengthOfLastWord = new LengthOfLastWord(); //problems.problem58
        assertEquals(5, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void flyMeToTheMoon_shouldReturn_four() {
        String s = "   fly me   to   the moon  ";
        var lengthOfLastWord = new LengthOfLastWord(); //problems.problem58
        assertEquals(4, lengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void luffyIsStillJoyboy_shouldReturn_six() {
        String s = "luffy is still joyboy";
        var lengthOfLastWord = new LengthOfLastWord(); //problems.problem58
        assertEquals(6, lengthOfLastWord.lengthOfLastWord(s));
    }

}