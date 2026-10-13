class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i] = Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);
        int n = nums.length;
        int mid = n/2;
        int i = 0;
        int j = mid;
        long sum = 0;
        while(i<mid && j<n){
            sum = (long)sum+(long)nums[j]*nums[j];
            sum = (long)sum-(long)nums[i]*nums[i];
             i++;
            j++;
        }
        if(j<nums.length) sum = (long) sum+ nums[j]*nums[j];
        if(i<mid) sum = (long) sum - nums[i]*nums[i];
        return sum;
    }
}