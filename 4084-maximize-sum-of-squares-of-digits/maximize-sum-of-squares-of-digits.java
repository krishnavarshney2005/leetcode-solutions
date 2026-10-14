class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num*9<sum) return "";
        StringBuilder sb = new StringBuilder();
        int n = sum/9;
        int r = sum%9;
        int i = 1;
        while(i<=n && i<=num){
            sb.append("9");
        
            i++;
        }
        if(i<=num) sb.append(Integer.toString(r));
        
            while(i<num) {
                sb.append("0");
                i++;
            }
        
        return sb.toString();
    }
}