class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        int[] res = new int[len];

        boolean skip = false;
        int i = 0; // deck
        int j = 0; // res

        Arrays.sort(deck);

        while(i < len){
            if(res[j] == 0){
                if(skip == false){
                    res[j] = deck[i];
                    i++;
                }
                skip = !skip;
            }

            j = (j+1)%len;
        }
        return res;
    }
}