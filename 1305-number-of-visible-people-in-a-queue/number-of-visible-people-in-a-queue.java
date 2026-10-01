class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans  = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i = heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]>=st.peek()){
                count++;
                st.pop();
            }
            if(st.isEmpty() && count!=0){
                ans[i] = count;
            }
            else if(st.isEmpty() ) ans[i] = 0;
            else{
                ans[i] = count+1 ;
            }
            st.push(heights[i]);
            count = 0;
        }
        return ans;
    }
}