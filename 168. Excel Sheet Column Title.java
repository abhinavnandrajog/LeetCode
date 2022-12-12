
class Solution {
    public String convertToTitle(int n) {
        StringBuilder build = new StringBuilder();
        
        while(n>0){
            n--;
            build.insert(0, (char)('A' + n%26));
            n = n/26;
        }
        return build.toString();
        }
    }
