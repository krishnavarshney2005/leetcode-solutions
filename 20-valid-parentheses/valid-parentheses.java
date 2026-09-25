class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
            return false;
        }
        Stack<Character>st = new Stack<>();
        int x = 1;
        for(int i = 0;i<s.length();i++){
            if( !st.isEmpty() && s.charAt(i)==')'){
                if(st.peek()=='(')  {
                    x= 0 ;
                    st.pop();
                }
                else return false;
            }
           else if(!st.isEmpty() &&s.charAt(i)=='}'){
                if(st.peek()=='{'){
                x = 0;
                 st.pop();}
                else return false;
            }
           else if(!st.isEmpty() && s.charAt(i)==']'){
                if(st.peek()=='['){
                    x = 0;
                st.pop();
                }
                else return false;
            }
            else
            st.push(s.charAt(i));
                            
        }
        return st.isEmpty();
       
        

    }
}