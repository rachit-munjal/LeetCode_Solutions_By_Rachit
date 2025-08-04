class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i = n-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                index = i-1;
                break;
            }
        }
        if(index != -1){
            int swap_idx = index;
            for(int j = n-1;j>=index+1;j--){
                if(nums[j]> nums[index]){
                    swap_idx = j;
                    break;
                }
            }
            int temp = nums[index];
            nums[index] = nums[swap_idx];
            nums[swap_idx] = temp;
        }
        reverse(nums, index + 1, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}