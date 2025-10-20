class Solution {
    public void swap(ListNode val1, ListNode val2) {
        int temp = val1.val;
        val1.val = val2.val;
        val2.val = temp;
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = null;
        ListNode p2 = null;

        ListNode temp = head;
        while(temp != null){
            if(p2 != null) p2 = p2.next;

             k--;

            if(k == 0){
                p1 = temp;
                p2 = head;
            }
            temp = temp.next;
        }
        swap(p1, p2);

        return head;
       
    }

   
}