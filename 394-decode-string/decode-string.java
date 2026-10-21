class Solution {
    public String decodeString(String s) {
       Deque<Integer> ct = new ArrayDeque<>(); 
       Deque<StringBuilder> st = new ArrayDeque<>(); 
       int n = 0;
       StringBuilder curr = new StringBuilder();
       for(char ch : s.toCharArray()){
          if(Character.isDigit(ch)){
            n = n*10+(ch-'0');
          }
          else if(ch=='['){
            ct.push(n);
            st.push(curr);
         n = 0;
         curr = new StringBuilder();
          }
          else if(ch==']'){
            int repeat = ct.pop();
            StringBuilder prev = st.pop();
            for(int i = 1;i<=repeat;i++){
                prev.append(curr);
            }
            curr = prev;
          }
else{
    curr.append(ch);
}
       }
       return curr.toString();
    }
}