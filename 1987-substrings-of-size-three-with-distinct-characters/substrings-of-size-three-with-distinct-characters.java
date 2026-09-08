class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()==1 || s.length()==2){
            return 0;
        }
        int count = 0;
        int l = 0;
        int r = 3; 
       
      HashMap<Character , Integer> map = new HashMap<>();
      for(int i= 0;i<r;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }
      if(map.size()==3){
        count++;
      }
      while(r<s.length()){
        map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
        map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
        if(map.get(s.charAt(l))==0){
            map.remove(s.charAt(l));
        }
        l++;
        r++;
        if(map.size()==3){
            count++;
        }
      }
      return count;
    }
}