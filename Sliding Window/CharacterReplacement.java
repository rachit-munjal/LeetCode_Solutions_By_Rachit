class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxF = 0;
        int maxLen = 0;
        while(r < s.length()){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1);

            maxF = Math.max(maxF, map.get(c));

            while((r-l+1) - maxF > k){
                char LeftChar = s.charAt(l);
                map.put(LeftChar, map.get(LeftChar)-1);
                l++;

                maxF = 0;
                for(int freq : map.values()){
                    maxF = Math.max(maxF, freq);
                }
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}