class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0;i<=n-1;i++){
            sum2 = sum2 + nums[i];
        }
        int diff = sum1 - sum2;
        return diff;
    }
}