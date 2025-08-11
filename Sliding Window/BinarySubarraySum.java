class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums, goal-1);
    }
    public int helper(int nums[], int goal){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        if(goal < 0){
            return 0;
        }
        while(r < nums.length){
            sum = sum + nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
}