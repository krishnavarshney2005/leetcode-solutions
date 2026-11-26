class Solution {
    public boolean canAliceWin(int n) {
       if(n<10){
        return false;
       }
       int s = n;
       
       int a = 0;
       int b = 0;
       for(int i = 10;i>0;i--){
            if(i%2==0 &&s>=i ){
                a = 1;
                b = 0;
                s = s-i;
            }
            else if (s>=i&& i%2!=0){
                a = 0;
                b = 1;
              
                s = s-i;
            }
            else{
                break;
            }
       }
       if(a==1){
        return true;
       }
       else{
        return false;
       }

      
    }
}