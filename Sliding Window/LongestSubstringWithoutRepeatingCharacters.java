class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int r = 0;r < s.length();r++){
            char ch = s.charAt(r);

            if(hm.containsKey(ch) && hm.get(ch) >= l){
                l = hm.get(ch) + 1;
            }

            hm.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}