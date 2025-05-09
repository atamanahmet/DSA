
public class mergeTwoList {

    class ListNode {
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

    // // Recursive II
    public ListNode mergeTwoListsRecursiveII(ListNode list1, ListNode list2) { //

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoListsRecursiveII(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursiveII(list1, list2.next);
            return list2;
        }

    }

    // // Reccursive I
    // public ListNode mergeTwoListsRecursiveI(ListNode list1, ListNode list2) { //
    // ListNode root = new ListNode();
    // if(list1==null) return list2;
    // if(list2==null) return list1;

    // if(list1.val<=list2.val){
    // root = list1;
    // list1=list1.next;
    // }
    // else{
    // root= list2;
    // list2= list2.next;
    // }
    // ListNode curr = root;

    // mergeHelperRecursiveI(list1, list2, curr);

    // return root;

    // }

    // public void mergeHelperRecursiveI(ListNode list1, ListNode list2, ListNode
    // curr) {
    // if(list1==null&&list2==null) return;
    // if (list1 == null) {
    // curr.next = list2;
    // return;
    // }
    // if (list2 == null) {
    // curr.next = list1;
    // return;
    // }

    // if (list1.val <= list2.val) {
    // curr.next = list1;
    // mergeHelperRecursiveI(list1.next, list2, curr.next);
    // } else {
    // curr.next = list2;
    // mergeHelperRecursiveI(list1, list2.next, curr.next);
    // }

    // }

    // Iterative

    // public ListNode mergeTwoListsRecursiveI(ListNode list1, ListNode list2) { //
    // Recursive I

    // ListNode newRoot = new ListNode();
    // ListNode curr = new ListNode();

    // if (list1.val <= list2.val) {
    // curr = list1;

    // list1 = list1.next;
    // } else {
    // curr = list2;

    // list2 = list2.next;
    // }

    // newRoot = curr;

    // while (true) {
    // if (list1 == null || list2 == null)
    // break;
    // if (list1.val <= list2.val) {
    // curr.next = list1;
    // list1 = list1.next;
    // } else {
    // curr.next = list2;
    // list2 = list2.next;
    // }
    // curr = curr.next;
    // }
    // if (list1 == null) {
    // curr.next = list2;
    // } else if (list2 == null) {
    // curr.next = list1;
    // }
    // return newRoot;
    // }
    // }
    // }

}
