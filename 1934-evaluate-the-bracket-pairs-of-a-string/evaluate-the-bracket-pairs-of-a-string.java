class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                StringBuilder sb = new StringBuilder();
                int j = i+1;
                while(s.charAt(j)!=')'){
                    sb.append(s.charAt(j));
                    j++;
                }
                if(map.containsKey(sb.toString())){
                    ans.append(map.get(sb.toString()));
                }
                else{
                    ans.append("?");
                }
                i = j;
            }
            else{
            ans.append(s.charAt(i));
            }
        }
         return ans.toString();
    }
}