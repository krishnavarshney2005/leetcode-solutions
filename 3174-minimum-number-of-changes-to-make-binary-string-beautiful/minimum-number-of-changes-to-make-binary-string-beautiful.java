class Solution {
    public int minChanges(String s) {
        int cnt = 0;
        for(int i = 0;i<s.length();i+=2){
            if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                cnt++;
            }
            else if(s.charAt(i)!='1' && s.charAt(i+1)!='0'){
                cnt++;
            }
        }
        return cnt;
    }
}