class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n < m) return "";

        int[] hash = new int[256]; // ASCII character counts

        // Count frequency of each char in t
        for (int i = 0; i < m; i++) {
            hash[t.charAt(i)]++;
        }

        int left = 0, count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        for (int right = 0; right < n; right++) {
            // If current char is still needed, increase matched count
            if (hash[s.charAt(right)] > 0) {
                count++;
            }
            // Decrease char count in hash (can go negative if extra in window)
            hash[s.charAt(right)]--;

            // When all chars from t are matched
            if (count == m) {
                // Shrink from left to remove unnecessary chars
                while (hash[s.charAt(left)] < 0) {
                    hash[s.charAt(left)]++;
                    left++;
                }

                // Update smallest window if found
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
            }
        }

        if (startIndex == -1) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }
}
