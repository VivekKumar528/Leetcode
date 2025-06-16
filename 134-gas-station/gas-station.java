class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int start = 0;
        int currTank = 0;
        for(int i=0;i<gas.length;i++){
            totalCost += cost[i];
            totalGas += gas[i];
            currTank += gas[i] - cost[i];
            if(currTank < 0){
                start = i + 1;
                currTank = 0;
            }

        }
        return totalGas >= totalCost ? start : -1;
    }
}