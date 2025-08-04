class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ni = 1;
        int pi = 0;
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[pi] = nums[i];
                pi = pi + 2;
            }
            else if(nums[i] < 0){
                ans[ni] = nums[i];
                ni = ni + 2;
            }
        }
        return ans;
    }
}