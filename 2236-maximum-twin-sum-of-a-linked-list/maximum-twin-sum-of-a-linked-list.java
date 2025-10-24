class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }
        int i = 0;
        temp = head;
        int max = Integer.MIN_VALUE;
        int size = st.size();
        while(i < (size/2)){
            int val1 = temp.val;
            int val2 = st.pop();
            max = Math.max(Math.abs(val1+val2), max);
            i++;
            temp = temp.next;
        }
        return max;
    }
}