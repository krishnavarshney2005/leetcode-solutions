class Solution {
    public int reverseDegree(String s) {
        int[] arr = new int[26];
        int x = 26;
        for(int i = 0;i<arr.length;i++){
            arr[i] = x;
            x--;
        }
        int degree = 0;
        for(int i = 0;i<s.length();i++){
            degree = degree +(i+1)*arr[s.charAt(i) - 'a'];
        }
        return degree;
    }
}