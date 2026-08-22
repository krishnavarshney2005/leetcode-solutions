class Solution {
    public int sum(int n){
        int sumd=0;
        while(n>0){
            int digit = n%10;
            sumd = sumd + digit;
            n = n/10;
        }
        return sumd;
    }
    public int product(int n){
        int pro = 1;
        while(n>0){
            int last = n%10;
            pro = pro*last;
            n = n/10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int sumDigit = sum(n);
        int proDigit = product(n);
        int totalSum = sumDigit + proDigit;
        if(n%totalSum==0)return true;
        else return false;
    }
}