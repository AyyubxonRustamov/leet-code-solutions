package problems.problem171;

/*
 *   171. Excel Sheet Column Number
 *
 *   Given a string columnTitle that represents the column title as appears in an Excel sheet,
 *   return its corresponding column number.
 *
 *   For example:
 *   A -> 1
 *   B -> 2
 *   C -> 3
 *   ...
 *   Z -> 26
 *   AA -> 27
 *   AB -> 28
 *   ...
 *
 *   Example 1:
 *   Input: columnTitle = "A"
 *   Output: 1
 *
 *   Example 2:
 *   Input: columnTitle = "AB"
 *   Output: 28
 *
 *   Example 3:
 *   Input: columnTitle = "ZY"
 *   Output: 701
 *   Constraints:
 *   1 <= columnTitle.length <= 7
 *   columnTitle consists only of uppercase English letters.
 *   columnTitle is in the range ["A", "FXSHRXW"].
 *
 *   Author: Ayyubxon Rustamov | ayyubxonmaverick@gmail.com
 */

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {

//        First Method
        int sum = 0, pow = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int x = columnTitle.charAt(i);
            sum += (x - 'A' + 1) * pow;
            pow *= 26;
        }
        return sum;

//        Second Method
//        int result = 0;
//        for (int i = 0; i < columnTitle.toCharArray().length; i++) {
//            int letterIndex = columnTitle.charAt(columnTitle.length() - 1 - i) - 64;
//            result += letterIndex * Math.pow(26, i);
//        }
//        return result;
    }
}
