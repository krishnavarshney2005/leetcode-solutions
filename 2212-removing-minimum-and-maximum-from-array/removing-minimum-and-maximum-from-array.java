class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i],min);
        }
        int front = 0;
        for(int i = 0;i<nums.length;i++){
            if(min==nums[i] || max==nums[i]){
                front = i+1;
            }
        }
        int back = 0;
        for(int i= nums.length-1;i>=0;i--){
            if(min==nums[i] || max==nums[i]){
                back = nums.length-i;
            }
        }
        int frontgear = 0;
        int reversegear = 0;
        for(int i = 0;i<nums.length;i++){
            if(min==nums[i] || max==nums[i]){
                frontgear = i+1;
                break;
            }
        }
        for(int i= nums.length-1;i>=0;i--){
            if(min==nums[i] || max==nums[i]){
                reversegear = nums.length-i;
                break;
            }
        }
        int gear = frontgear + reversegear;
        return Math.min(gear,Math.min(front,back));
    }
}