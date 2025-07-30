class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            int difference = target - nums[i];
            if(hs.containsKey(difference)){
                ans[0] = hs.get(difference);
                ans[1] = i;
                return ans;
            }
            hs.put(nums[i], i);
        }
        return ans;
    }
}