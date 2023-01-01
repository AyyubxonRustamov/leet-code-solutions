package problems.problem9;

/*
    9. Palindrome number

    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Constraints:

    -231 <= x <= 231 - 1

    Author: Ayyubxon Rustamov | ayyubxonmaverick@gmail.com
*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        return s.substring(0, s.length() / 2).equals(new StringBuilder(s.substring(
                s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1)).reverse().toString());
    }
}
