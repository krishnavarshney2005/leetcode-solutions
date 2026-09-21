class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int l = 0;
        int r = 0;
        int minlen = Integer.MAX_VALUE;
        int si = -1;
        int m = t.length();
        int n = s.length();
        int count = 0;
        int[] hash = new int[256];
        for(char ch : t.toCharArray()){
            hash[ch]++;
        }
        while(r<n){
            if(hash[s.charAt(r)]>0)  {
            count++;;
            
            }
            hash[s.charAt(r)]--;
            while(count==m){
                if(r-l+1<minlen){
                    minlen = r-l+1;
                    si = l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count = count-1;
                }
                l++;
            }
            r = r+1;
        }
        return si ==-1 ? "" : s.substring(si,si+minlen);
    }
}