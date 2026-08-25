class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        int missing = k;

        while(map.containsValue(missing)){
            missing = missing+k;
            
        }
        return  missing;
    }
}