class Solution {
    public int majorityElement(int[] nums) {
        // Better Approach - O(2n)
        // HashMap <Integer, Integer> hm = new HashMap<>();
        // for(int i = 0;i<nums.length;i++){
        //     hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> it: hm.entrySet()){
        //     if(it.getValue() > nums.length/2){
        //         return it.getKey();
        //     }
        // }
        // return -1;
        
        // Optimal Approach - O(n)
        int count = 0;
        int ele = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == ele){
                count1++;
            }
        }
        if(count1 > nums.length/2){
            return ele;
        }
        return -1;
    }
}