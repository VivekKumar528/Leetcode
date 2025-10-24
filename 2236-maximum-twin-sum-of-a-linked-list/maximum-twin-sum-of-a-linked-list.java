class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            int val1 = list.get(i);
            int val2 = list.get(list.size()-1-i);
            max = Math.max(Math.abs(val1+val2), max);
        }
        return max;
    }
}