class Solution {
    public int maxScore(int[] arr, int k) {

        int n = arr.length;
        int windowSize = n - k;

        int totalSum = 0;
        int windowSum = 0;

        
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];

            if (i < windowSize) {
                windowSum += arr[i];
            }
        }

        if (windowSize == 0) {
            return totalSum;
        }

        int minWindowSum = windowSum;

        
        for (int i = windowSize; i < n; i++) {

    
            windowSum -= arr[i - windowSize];

            
            windowSum += arr[i];

            
            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}