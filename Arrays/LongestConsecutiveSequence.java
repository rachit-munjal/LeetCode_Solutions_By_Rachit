import java.util.*;
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int count = 1;
        int longest = 1;
        int n = arr.length;
        Arrays.sort(arr);
        int lastSmallest = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i] - 1 == lastSmallest){
                count++;
                lastSmallest = arr[i];
            }
            else if(arr[i] != lastSmallest){
                count = 1;
                lastSmallest = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}