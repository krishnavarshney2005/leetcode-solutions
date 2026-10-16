class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        int i = 0;
        boolean flag = true;
        while( i<nums.length){
            if(i>max){
                flag = false;
                break;
            }
            int t = i+nums[i];
            max = Math.max(max,t);
            i++;
        }
       if(flag){
        return true;
       }
        return false;
    }
}