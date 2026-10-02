class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;

        int[] res = new int[len];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<len;i++) q.add(i);

        Arrays.sort(deck);

        for(int i=0;i<len;i++){
            int idx = q.remove();
            res[idx] = deck[i];

            if(!q.isEmpty()){
                q.add(q.remove());
            }
        }
        return res;
    }
}