class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                flag = true;
            }
            else if(s.charAt(i)=='b' && flag==true){
                return false;
            }
        }
        return true;
    }
}