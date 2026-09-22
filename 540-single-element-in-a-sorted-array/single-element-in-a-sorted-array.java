class Solution {
    public int singleNonDuplicate(int[] arr) {
        int len = arr.length;

        int l = 0;
        int h = len-1;

        while(l < h){
            int mid = l + (h-l)/2;
            boolean isEven;

            if((h-mid)%2 == 0) isEven = true;
            else isEven = false;

            if(arr[mid] == arr[mid+1]){
                if(isEven) l = mid+2;
                else h = mid-1;
            } else {
                if(isEven) h = mid;
                else l = mid+1;
            }
        }    
        return arr[h];
    }
}