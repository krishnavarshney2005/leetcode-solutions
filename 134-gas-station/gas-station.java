class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg = 0;
        int tc = 0;
        int start = 0;
        int currgas = 0;
        for(int i = 0;i<gas.length;i++){
            tg += gas[i];
            tc += cost[i];
             currgas += gas[i]-cost[i];
            if(currgas<0){
                start = i+1;
                currgas = 0;
            }
        }
        if(tg>=tc) return start;
        return -1;
    }
}