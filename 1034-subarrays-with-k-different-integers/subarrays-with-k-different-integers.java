class Solution {
    public int count(int[] nums , int k){
        int l = 0; 
        int r = 0; 
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l], map.get(nums[l]) - 1);
                
                    if(map.get(nums[l])==0){
                        map.remove(nums[l]);
                    }
                
                l++;
            }
            count = count + r-l+1;
            r= r + 1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k) - count(nums,k-1);
    }
}