class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;

        int countOne = 0;
        int countZero = 0;

        for(int stud : students){
            if(stud == 0) countZero++;
            else countOne++;
        }

        for(int i=0;i<len;i++){
            int sand = sandwiches[i];

            if(sand == 0 && countZero == 0) return len-i;
            if(sand == 1 && countOne == 0) return len - i;

            if(sand == 0) countZero--;
            else countOne--;
        }
        return 0;
    }
}