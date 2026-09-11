class Solution {
    public int totalNumbers(int[] digits) {
            int n = 0;  
            int count = 0;
            HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0;i<digits.length;i++){
          if(digits[i]==0)continue;
          n=0;
        //    n = digits[i];
           for(int j = 0;j<digits.length;j++){
            n=0;
            // n = digits[j] + n*10;
            for(int k = 0 ; k<digits.length; k++){
                n=digits[i]*100+digits[j]*10+digits[k];
                // n = n*10 + digits[k];
                if(i==j || j==k || i==k || n%2!=0) continue;
                
                if(map.containsKey(n)==true)continue;
                
                else{
                     count++;
                      map.put(n,k);
                }
                n= n/10;
                
            }
           }
        }
        return count;
    }
}