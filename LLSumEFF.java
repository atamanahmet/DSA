public class LLSumEFF {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // todo - in-place mutation
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode dummy = new ListNode();

        ListNode curr = dummy;

        int sum = 0;

        while (l1 != null || l2 != null || sum == -1) {

            if (sum == -1) {
                sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + 1;
            } else {
                sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val);
            }

            curr.next = new ListNode(sum % 10);

            if (sum >= 10)
                sum = -1;

            curr = curr.next;

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }

        return dummy.next;
    }
}

// if (l1 == null) {
// while (l2 != null) {

// if (isCarry) {
// sum = l2.val + 1;

// } else {
// curr.next = l2;
// return dummy.next;
// }
// if (sum <= 9) {
// curr.next = new ListNode(sum);
// curr = curr.next;
// curr.next = l2.next;
// return dummy.next;
// } else {
// curr.next = new ListNode(sum % 10);
// isCarry = true;
// }
// curr = curr.next;
// l2 = l2.next;
// }

// }
// if (l2 == null) {
// while (l1 != null) {
// if (isCarry) {
// sum = l1.val + 1;
// } else {
// curr.next = l1;
// return dummy.next;
// }
// if (sum <= 9) {
// curr.next = new ListNode(sum);
// curr = curr.next;
// curr.next = l1.next;
// return dummy.next;
// } else {
// curr.next = new ListNode(sum % 10);
// isCarry = true;
// }

// curr = curr.next;
// l1 = l1.next;
// }

// }
// if (isCarry) {
// curr.next = new ListNode(1);
// }

// return dummy.next;
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
// class Solution {
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
// if (l1 == null && l2 == null)
// return null;
// if (l1 == null)
// return l2;
// if (l2 == null)
// return l1;
// ListNode root = new ListNode();

// boolean isOverflow = false;
// int sum = l1.val + l2.val;

// if (sum > 9) {
// isOverflow = true;
// root = new ListNode(sum % 10);
// } else {
// root = new ListNode(sum);

// }

// ListNode curr = root;

// l1 = l1.next;
// l2 = l2.next;

// while (l1 != null && l2 != null) {
// if (isOverflow) {
// sum = l1.val + l2.val + 1;
// } else {
// sum = l1.val + l2.val;
// }

// if (sum <= 9) {
// curr.next = new ListNode(sum);
// isOverflow = false;
// } else {
// curr.next = new ListNode(sum % 10);
// isOverflow = true;
// }
// curr = curr.next;
// l1 = l1.next;
// l2 = l2.next;

// }

// if (l1 == null) {
// while (l2 != null) {

// if (isOverflow) {
// sum = l2.val + 1;

// } else {
// curr.next = l2;
// return root;
// }
// if (sum <= 9) {
// curr.next = new ListNode(sum);
// curr = curr.next;
// curr.next = l2.next;
// return root;
// } else {
// curr.next = new ListNode(sum % 10);
// isOverflow = true;
// }
// curr = curr.next;
// l2 = l2.next;
// }

// }
// if (l2 == null) {
// while (l1 != null) {
// if (isOverflow) {
// sum = l1.val + 1;
// } else {
// curr.next = l1;
// return root;
// }
// if (sum <= 9) {
// curr.next = new ListNode(sum);
// curr = curr.next;
// curr.next = l1.next;
// return root;
// } else {
// curr.next = new ListNode(sum % 10);
// isOverflow = true;
// }

// curr = curr.next;
// l1 = l1.next;
// }

// }
// if(isOverflow){
// curr.next = new ListNode(1);
// }

// return root;
// }
// }
