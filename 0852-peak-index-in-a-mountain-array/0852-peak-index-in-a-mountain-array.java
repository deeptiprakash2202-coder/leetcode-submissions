class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length-1;
        int index=0;
        for (int i=1;i<n;i++){
            if (arr[i]>arr[i-1]){
                index=i;
            }
        }
        return index;
    }
}