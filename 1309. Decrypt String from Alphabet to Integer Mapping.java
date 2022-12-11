/*  https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/  */
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        while(i<n){
            if(i+2 < n && s.charAt(i+2) == '#' ){
                sb.append((char) ('a' + Integer.valueOf(s.substring(i,i+2))-1));
                i+=3;
            }else{
                 sb.append((char) ('a' + Integer.valueOf(s.substring(i,i+1))-1));
                i++;
            }
        }
        return sb.toString();
    }
}
