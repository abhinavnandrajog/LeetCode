/*  https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/  */
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res = new StringBuilder("");
        StringBuilder res1 = new StringBuilder("");
        for(int i = 0;i<word1.length;i++){
            res.append(word1[i]);
        }
        for(int j = 0;j<word2.length;j++){
            res1.append(word2[j]);
        }
        if(res1.toString().equals(res.toString())){
            return true;
        }
    return false;
    }
    
}
