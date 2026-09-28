class Solution {
    public int divsum(int x){
        int count = 0;
        int sum = 0;
        for(int i = 1;i*i<=x;i++){
            if(x%i==0){
                int other = x/i;
                sum = sum+i;
                count++;

                if(i!= other){
                    sum = sum+other;
                count++;
                }
            }
        }
        if(count == 4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + divsum(nums[i]);
        }
        return sum;
    }
}