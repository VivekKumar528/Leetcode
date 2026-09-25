class Solution {
    public boolean possibleHai(int[] time, long givenTime, int totalTrips){
        long actualTrips = 0;
        for(int t : time){
            actualTrips += (givenTime/t);
        }

        return actualTrips >= totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int len = time.length;
        long l = 1;
        Arrays.sort(time);
        long r = (long)time[0] * totalTrips;

        while(l < r){
            long mid = l + (r - l)/2;
            if(possibleHai(time, mid, totalTrips)) r = mid;
            else l = mid+1;
        }

        return l;
    }
}