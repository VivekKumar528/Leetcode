class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int nodeFromLast = len - k + 1;
        ListNode start = head;
        ListNode end = head;
        for(int i=1;i<k;i++) start = start.next;
        for(int i=1;i<nodeFromLast;i++) end = end.next;

        int tempVal = start.val;
        start.val = end.val;
        end.val = tempVal;

        return head;
    }
}