class Solution {
    public int maximum69Number (int num) {
        int[] arr = String.valueOf(num)
                  .chars()
                  .map(ch -> ch - '0')
                  .toArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==6){
                arr[i] = 9;
                break;
            }
        }    
        

       StringBuilder sb = new StringBuilder();

       for (int digit : arr) {
           sb.append(digit);
         }

        int ans = Integer.parseInt(sb.toString());          

      return ans;
    }
}