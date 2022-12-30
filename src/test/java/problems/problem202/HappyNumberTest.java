package problems.problem202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HappyNumberTest {

    @Test
    void nineTeen_shouldReturn_true() {
        var happyNumber = new HappyNumber(); //problems.problem202
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    void two_shouldReturn_false() {
        var happyNumber = new HappyNumber(); //problems.problem202
        assertFalse(happyNumber.isHappy(2));
    }
}