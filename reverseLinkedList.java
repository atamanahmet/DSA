public class reverseLinkedList {
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

    class Solution { // recursive
        public ListNode reverseList(ListNode head) {
            if (head == null)
                return head;
            return reverse(head, null);
        }

        public ListNode reverse(ListNode head, ListNode newHead) {
            if (head == null)
                return newHead;
            ListNode next = head.next;
            head.next = newHead;// first step newHead=null newTail.next=newHead/(null)
            newHead = head;
            head = next;
            return reverse(head, newHead);
        }

    }
    // class Solution {
    // public ListNode reverseList(ListNode head) {
    // if(head==null) return head;
    // ListNode curr = head;
    // ListNode prev = null;
    // ListNode after = null;
    // while(curr.next!=null){
    // after=curr.next;
    // curr.next=prev;
    // prev=curr;
    // curr=after;
    // }
    // curr.next=prev;
    // return curr;
    // }
    // }
    // class Solution { // Stack
    // public ListNode reverseList(ListNode head) {
    // if(head==null) return head;
    // Stack<ListNode> stack = new Stack<>();
    // ListNode curr = head;

    // while(curr!=null){
    // stack.push(curr);
    // curr=curr.next;
    // }
    // ListNode newHead= stack.pop();
    // curr=newHead;
    // while(!stack.isEmpty()){
    // curr.next=stack.pop();
    // curr=curr.next;
    // }
    // curr.next=null;
    // return newHead;
    // }
    // }
    // class Solution {
    // public ListNode reverseList(ListNode head) {
    // ListNode prev=null;
    // return reverseRecur(head, prev);
    // }
    // ListNode reverseRecur(ListNode head, ListNode prev){
    // if(head==null) return prev;
    // ListNode next = head.next;
    // head.next=prev;
    // return reverseRecur(next, head);
    // }
    // }
    // class Solution {
    // public ListNode reverseList(ListNode head) {

    // ListNode current;
    // ListNode prev;
    // // 1->2->3->4->5->null
    // current = head;
    // prev = null;
    // while (current != null) {
    // ListNode temp=current.next;
    // current.next = prev;
    // prev = current;
    // current = temp;
    // temp=null;
    // }
    // return prev;
    // }
    // }
}
