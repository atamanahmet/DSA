public class LinkedListSumIterative {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode root = new ListNode();

        boolean isOverflow = false;
        int sum = l1.val + l2.val;

        if (sum > 9) {
            isOverflow = true;
            root = new ListNode(sum % 10);
        } else {
            root = new ListNode(sum);

        }

        ListNode curr = root;

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null && l2 != null) {
            if (isOverflow) {
                sum = l1.val + l2.val + 1;
            } else {
                sum = l1.val + l2.val;
            }

            if (sum <= 9) {
                curr.next = new ListNode(sum);
                isOverflow = false;
            } else {
                curr.next = new ListNode(sum % 10);
                isOverflow = true;
            }
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;

        }

        if (l1 == null) {
            while (l2 != null) {

                if (isOverflow) {
                    sum = l2.val + 1;

                } else {
                    curr.next = l2;
                    return root;
                }
                if (sum <= 9) {
                    curr.next = new ListNode(sum);
                    curr = curr.next;
                    curr.next = l2.next;
                    return root;
                } else {
                    curr.next = new ListNode(sum % 10);
                    isOverflow = true;
                }
                curr = curr.next;
                l2 = l2.next;
            }

        }
        if (l2 == null) {
            while (l1 != null) {
                if (isOverflow) {
                    sum = l1.val + 1;
                } else {
                    curr.next = l1;
                    return root;
                }
                if (sum <= 9) {
                    curr.next = new ListNode(sum);
                    curr = curr.next;
                    curr.next = l1.next;
                    return root;
                } else {
                    curr.next = new ListNode(sum % 10);
                    isOverflow = true;
                }

                curr = curr.next;
                l1 = l1.next;
            }

        }
        if (isOverflow) {
            curr.next = new ListNode(1);
        }

        return root;
    }
}
