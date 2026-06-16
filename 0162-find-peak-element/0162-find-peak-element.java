class Solution {
    public int findPeakElement(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int index=0;
        while (low<high){
            int mid=(high+low)/2;
            if (arr[mid]<arr[mid+1]){
                low=mid+1; 
                } 
               else{
               high=mid;

        }      
    }
             return low;
        }
    }
