/* https://leetcode.com/problems/reverse-words-in-a-string-iii/description/ */
class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
         String[] str = s.split(" ");
         for(int i = 0;i<str.length;i++){
             StringBuilder res = new StringBuilder();
             res.append(str[i]);
             ans.append(res.reverse());
             if(i != str.length -1){
                 ans.append(" ");
             }
         }
         return ans.toString();
    }
}
