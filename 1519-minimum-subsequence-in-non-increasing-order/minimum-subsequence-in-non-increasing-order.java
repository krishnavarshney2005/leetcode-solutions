class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans  = new ArrayList<>();
        int presum = 0;
        for(int i = 0;i<nums.length;i++){
            presum = presum+nums[i];
        }
        Arrays.sort(nums);

        int k = 0;
        int j = nums.length - 1;

        while (k < j) {
          int temp = nums[k];
          nums[k] = nums[j];
          nums[j] = temp;

            k++;
            j--;
       }


        int sum = 0;
        int i = 0;
        while(sum<=presum){
            sum = sum+nums[i];
            presum = presum-nums[i];
            ans.add(nums[i]);
            i++;
        }
       
        return ans;

    }
}