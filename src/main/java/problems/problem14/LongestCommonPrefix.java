package problems.problem14;

/*
    14. Longest Common Prefix

    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.

    Author: Ayyubxon Rustamov | ayyubxonmaverick@gmail.com
*/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String p = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(p) != 0) {
                p = p.substring(0, p.length() - 1);
                if (p.length() == 0) return "";
            }
        }
        return p;
    }
}
