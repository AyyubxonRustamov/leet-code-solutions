package problems.problem70;

/*
    83. Remove Duplicates from Sorted List

    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
    Return the linked list sorted as well.

    Example 1:

    Input: head = [1,1,2]
    Output: [1,2]

    Example 2:

    Input: head = [1,1,2,3,3]
    Output: [1,2,3]

    Constraints:

    The number of nodes in the list is in the range [0, 300].
    -100 <= Node.val <= 100
    The list is guaranteed to be sorted in ascending order.

    Author: Ayyubxon Rustamov | ayyubxonmaverick@gmail.com
*/

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while (list != null) {
            if (list.next == null)
                break;
            if (list.val == list.next.val)
                list.next = list.next.next;
            else
                list = list.next;
        }
        return head;
    }
}
