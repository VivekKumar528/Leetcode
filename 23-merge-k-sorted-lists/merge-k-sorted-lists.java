/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        ListNode mergedList = new ListNode(-1);
        ListNode temp = mergedList;
        ListNode first = l1;
        ListNode second = l2;
        while(first != null && second != null){
            if(first.val < second.val){
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        if(first != null) temp.next = first;
        if(second != null) temp.next = second;
        return mergedList.next;
    }

    public ListNode partitionAndMerge(int start, int end, ListNode[] lists){
        if(start > end) return null;
        if(start == end) return lists[start];

        int mid = start + (end-start) / 2;

        ListNode l1 = partitionAndMerge(start, mid, lists);
        ListNode l2 = partitionAndMerge(mid+1, end, lists);

        return mergeTwoSortedLists(l1, l2);

    }
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;

        if(len == 0) return null;

        return partitionAndMerge(0, len-1, lists);
    }
}