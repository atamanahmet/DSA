import org.w3c.dom.Node;

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
class ListNode {
    public int val;
    public int next;

    public ListNode() {
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return null;
        }
        ListNode current;
        ListNode otherCurrent;
        ListNode head;
        boolean check = true;
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
            if (current.next == null) {
                if (otherCurrent == null) {
                    break;
                }
                current.next = otherCurrent;
                current = otherCurrent;
                otherCurrent = null;
            } else {
                if (otherCurrent == null) {
                    break;
                } else if (current.next.val > otherCurrent.val) {
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
