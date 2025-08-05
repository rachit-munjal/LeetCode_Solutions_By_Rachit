class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxLen = Integer.MIN_VALUE;
        int zero = 0;
        while(r < nums.length){
            if(nums[r] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}