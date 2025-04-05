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

class MergeLinkedListEff {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {

        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        if (list1 == null || list2 == null)
            return (list1 == null) ? list2 : list1;

        head = (list1.val < list2.val) ? list1 : list2;
        list1 = (head == list1) ? list1.next : list1;
        list2 = (head == list2) ? list2.next : list2;

        ListNode curr = head;

        while (list1 != null && list2 != null) {

            curr.next = (list1.val < list2.val) ? list1 : list2;
            list1 = (list1 == curr.next) ? list1.next : list1;
            list2 = (list2 == curr.next) ? list2.next : list2;
            curr = curr.next;

        }
        while (list1 != null) {
            curr.next = list1;
            break;
        }
        while (list2 != null) {
            curr.next = list2;
            break;
        }
        return head;
    }
}

// public /**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode() {}
// * ListNode(int val) { this.val = val; }
// * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */

// class MergeLinkedListEff {
// class Node {
// int val;
// Node next;

// public Node(int val) {
// this.val = val;
// }

// public Node() {

// }
// }

// public Node mergeTwoLists(Node list1, Node list2) {
// Node head = new Node();
// if (list1 == null)
// return list2;
// if (list2 == null)
// return list1;

// if (list1.val < list2.val) {
// head = list1;
// list1 = list1.next;
// } else {
// head = list2;
// list2 = list2.next;
// }
// Node curr = head;

// while (list1 != null && list2 != null) {

// if (list1.val < list2.val) {
// curr.next = list1;
// list1 = list1.next;
// } else {
// curr.next = list2;
// list2 = list2.next;
// }
// curr = curr.next;
// }
// while (list1 != null) {
// curr.next = list1;
// list1 = list1.next;
// curr = curr.next;
// }
// while (list2 != null) {
// curr.next = list2;
// list2 = list2.next;
// curr = curr.next;
// }
// return head;
// }
// }
