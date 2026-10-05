class Solution {
    public int scoreOfParentheses(String s) {
        int len = s.length();
        ArrayList<Integer> arr = new ArrayList<>();
        int score = 0;

        for(int i=0;i<len;i++){
            if(s.charAt(i) == '('){
                arr.add(score);
                score = 0;
            } else {
                if(s.charAt(i-1) == '('){
                    score = arr.get(arr.size()-1) + 1;

                } else {
                    if(s.charAt(i-1) == '(') score += 1;
                    else score = arr.get(arr.size()-1) + (2 * score);
                }
                arr.remove(arr.size()-1);
            }
        }
        return score;


    }
}