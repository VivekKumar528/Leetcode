class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode prev = null;
        ListNode nextNode = null;

        while(mid != null){
            nextNode = mid.next;
            mid.next = prev;
            prev = mid;
            mid = nextNode;

        }
        ListNode curr = head;
        int max = Integer.MIN_VALUE;
        while(prev != null){
            max = Math.max(curr.val + prev.val, max);
            prev = prev.next;
            curr = curr.next;
        }
        return max;
    }
}