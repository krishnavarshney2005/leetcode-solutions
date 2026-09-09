class Solution {
    public static int average(int [] arr ,int l,int r,int k){
        int sum = 0;
        for(int i =l;i<=r;i++){
            sum = sum + arr[i];
        }
        return sum/k;
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int r = k;
        int count = 0;
        int x = 0;
        int avg = 0 ;  
        for(int i = 0;i<r;i++){
            x = x + arr[i];
        }
        avg = x/k;
        if(avg>=threshold) count++;
        while(r<arr.length){
            l++;
            avg = average(arr,l,r,k);
            if(avg>=threshold)count++;
            r++;
        }
        return count;
    }
}