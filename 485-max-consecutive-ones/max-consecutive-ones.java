class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = 0;
        int r = 0; 
        int maxlen = 0;
        int len = 0;
        while(r<nums.length){
            if(nums[r]==0){
                l = r+1;
                r++;
            }
            else{
            len = r-l+1;
            maxlen = Math.max(maxlen,len);
            r++;
            }
        }
        return maxlen;
    }
}