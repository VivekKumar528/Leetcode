class Solution {
    class Pair{
        int ele;
        int idx;
        Pair(int ele, int idx){
            this.ele = ele;
            this.idx = idx;
        }
    }
    public int[] dailyTemperatures(int[] arr) {
        int len = arr.length;
        int[] ans = new int[len];
        Stack<Pair> st = new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().ele <= arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = 0;
            else ans[i] = st.peek().idx - i;

            st.push(new Pair(arr[i], i));
            
        }
        return ans;
    }
}