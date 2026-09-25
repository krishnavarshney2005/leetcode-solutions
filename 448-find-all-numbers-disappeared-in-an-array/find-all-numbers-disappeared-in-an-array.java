class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr =  new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = i+1;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i = 0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
}