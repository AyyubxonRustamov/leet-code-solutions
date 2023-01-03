package problems.problem7;

/*
    7. Reverse Integer

    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
    value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:
    Input: x = 123
    Output: 321

    Example 2:
    Input: x = -123
    Output: -321

    Example 3:
    Input: x = 120
    Output: 21

    Constraints:
    -231 <= x <= 231 - 1

    Author: Ayyubxon Rustamov | ayyubxonmaverick@gmail.com
*/

public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0, length = String.valueOf(x).length();
        if (x < 0) --length;
        for (int i = 1; i <= length; i++) {
            reversed += (x % 10) * Math.pow(10, length - i);
            x = x / 10;
        }
        return (reversed < Integer.MAX_VALUE && reversed > Integer.MIN_VALUE) ? reversed : 0;
    }
}