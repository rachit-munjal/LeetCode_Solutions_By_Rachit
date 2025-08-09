class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxisum = 0;
        for(int i = 0;i<k;i++){
            lsum = lsum + cardPoints[i];
        }
        maxisum = lsum;
        int rindex = cardPoints.length - 1;
        for(int i = k-1;i>=0;i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rindex--];
            maxisum = Math.max(lsum+rsum, maxisum);
        }
        return maxisum;
    }
}