/*  https://leetcode.com/problems/determine-if-string-halves-are-alike/description/  */
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        String fin = s.toLowerCase();
        String a = fin.substring(0,n);
        String b = fin.substring(n,s.length());
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<n;i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' ||a.charAt(i) == 'i'|| a.charAt (i) == 'o'||a.charAt(i) == 'u'){
                count1++;
            }
            if(b.charAt(i) == 'a'||b.charAt(i) =='e'||b.charAt(i) =='i'||b.charAt(i) =='o'||b.charAt(i) =='u'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;

    }
}
