class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        ListNode temp = head.next;
        while (temp != null) {
            int sum = 0;
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            ListNode t = new ListNode(sum);
            res.next = t;
            res = t;
            temp = temp.next;
        }
        return dummy.next;
    }
}