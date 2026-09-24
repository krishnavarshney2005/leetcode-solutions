class Solution {
    public int longest(int[]nums,int k){
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int sum = 0;
        while(r<nums.length){
            sum = sum+nums[r];
           while (l <= r && sum > k) {
                sum = sum - nums[l];
                l++;
            }
            if(sum==k){
                maxlen = Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;

    }
    public int minOperations(int[] nums, int x) {
      int totalsum = 0;
      for(int i = 0;i<nums.length;i++){
        totalsum = totalsum+nums[i];
      }
      int k = totalsum-x;
      int max = longest(nums,k);
      if(k==0) return nums.length;
      if(k<0) return -1;
      if(max==0 && k!=0) return -1;
      return nums.length-max;
       
    }
}