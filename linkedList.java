/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return (list1 == null && list2 != null) ? list2 : (list2 == null) ? list1 : null;

        ListNode current;
        ListNode otherCurrent;
        ListNode head;

        if (list1.val <= list2.val) {
            current = list1;
            otherCurrent = list2;
            head = list1;
        } else {
            current = list2;
            otherCurrent = list1;
            head = list2;
        }

        while (current != null) {
            if (otherCurrent == null) {
                break;
            }
            if (current.next == null) {
                current.next = otherCurrent;
                current = otherCurrent;
                break;
            } else {
                if (current.next.val > otherCurrent.val) {
                    ListNode temp = current.next;
                    current.next = otherCurrent;
                    current = otherCurrent;
                    otherCurrent = temp;
                } else {
                    current = current.next;
                }
            }
        }
        return head;
    }
}
