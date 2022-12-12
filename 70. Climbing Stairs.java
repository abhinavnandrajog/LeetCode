/* https://leetcode.com/problems/climbing-stairs/description/ */
class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int n2 = 2;
        if(n == 1){
            return n;
        }
        if(n == 2){
            return n;
        }
        int i = 2;
        while(i<n){
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
            i++;
        }
        return n2;
    }
}
