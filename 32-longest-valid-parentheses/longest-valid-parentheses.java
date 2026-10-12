class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int maxlen = 0;
        st.push(-1);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                 int currlen = i-st.peek();
                 maxlen = Math.max(maxlen,currlen);
                }
            }
        }
        return maxlen;
    }
}