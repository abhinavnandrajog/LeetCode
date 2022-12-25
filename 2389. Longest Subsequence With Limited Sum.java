/* https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/ */
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);
        for(int i = 0;i<queries.length;i++){
            int sum = 0;
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(sum + nums[j]<=queries[i]){
                    count++;
                    sum = sum  + nums[j];
                }
                else{
                    break;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
