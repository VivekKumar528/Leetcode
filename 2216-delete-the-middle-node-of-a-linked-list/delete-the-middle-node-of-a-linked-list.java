class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int reqIdx = len/2;
        ListNode prev = null;
        temp = head;
        int idx = 0;
        while(idx < reqIdx){
            prev = temp;
            temp = temp.next;
            idx++;
        }
        prev.next = temp.next;
        return head;

    }
}