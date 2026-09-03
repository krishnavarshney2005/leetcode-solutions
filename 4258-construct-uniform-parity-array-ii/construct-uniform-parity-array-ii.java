class Solution {
    public boolean uniformArray(int[] nums) {
        int smallodd = Integer.MAX_VALUE;
        for(int i: nums){
            if(i%2!=0){
            smallodd = Math.min(i,smallodd);
            }
        }
        if(smallodd == Integer.MAX_VALUE){
            return true;
        }
        for(int i : nums){
            
                if(i%2==0 && i<=smallodd){
                    return false;
                }
            
        }
        return true;
    }
}