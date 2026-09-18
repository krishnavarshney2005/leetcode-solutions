class Solution {
     public int subarray(int[]nums, int goal){
     if(goal<0) return 0;
        int l = 0;  
        int r = 0;
        int sum = 0;
        int count = 0;
        while(r<nums.length){
            sum = sum + nums[r];
            while(sum>goal){
                sum = sum-nums[l];
                l = l+1;
            }
            count = count+ ( r-l+1);
            r = r+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return subarray(nums,k)-subarray(nums,k-1);
    }
}