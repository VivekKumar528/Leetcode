class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // int len = 0;
        // ListNode temp = head;
        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }
        // temp = head;
        // len /= 2;
        // while(len --> 1){
        //     temp = temp.next;
        // }
        // if(temp != null && temp.next != null){
        //     temp.val = temp.next.val;
        //     temp.next = temp.next.next;
        // }
        // return head;
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = null; 
        while(fast != null && fast.next != null){
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevSlow.next = slow.next;
        return head;

    }
}