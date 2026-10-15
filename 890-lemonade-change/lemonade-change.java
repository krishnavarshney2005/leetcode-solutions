class Solution {
    public boolean lemonadeChange(int[] bills) {
        int total = 0;
        int[]a = {0,0,0};
        boolean ans = true;
        for(int i = 0;i<bills.length;i++){
            if(bills[i] == 5){
                
                a[0]++;
            }
            else if(bills[i]==10){
                if(a[0]<1) {
                    ans = false;
                    break;
                }
                else{
                    a[0]--;
                    
                }
                a[1]++;
            }
            else{
                if (a[1] >= 1 && a[0] >= 1) {
                    a[1]--;
                    a[0]--;
                } 
                else if (a[0] >= 3) {
                    a[0] -= 3;
                } 
                else {
                    return false;
                }

                a[2]++;
            }
        }
        return ans;
    }
}