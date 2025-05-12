public class mergeKsortedIterative {

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

        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0)
                return null;
            for (int i = 0; i < lists.length; i = i + 2) {

            }
            return new ListNode();

        }

        public ListNode mergeTwoList(ListNode list1, ListNode list2) {
            if (list1 == null || list2 == null)
                return null;
            ListNode newRoot = new ListNode();
            if (list1.val <= list2.val) {
                newRoot = list1;
                list1 = list1.next;
            } else {
                newRoot = list2;
                list2 = list2.next;
            }
            ListNode curr = newRoot;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    curr.next = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    list2 = list2.next;
                }
                curr = curr.next;
            }
            if (list1 == null) {
                curr.next = list2;

            }
            if (list2 == null) {
                curr.next = list1;
            }
            return newRoot;
        }
    }
}
