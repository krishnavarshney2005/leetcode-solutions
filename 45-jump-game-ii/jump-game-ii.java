class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int i = 0;
      int jump= 0;
      int j = 0;
        while( i<nums.length-1){
            
            int t =i+ nums[i];
            max = Math.max(max,t);
            if(i==j){
                jump++;
                j = max;
            }
            i++;
            
        }
      return jump;
    }
}