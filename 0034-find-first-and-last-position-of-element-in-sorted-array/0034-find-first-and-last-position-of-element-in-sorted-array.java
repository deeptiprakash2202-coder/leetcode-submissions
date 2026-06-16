class Solution {
    public int firstoccurence (int[] arr, int target) {
        int high=arr.length-1;
        int low=0;
        int index=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>target){
                high=mid-1;
             }
             else if (arr[mid]<target){
                low=mid+1;
             }
             else{
                index=mid;
                high=mid-1;
             }
        }
        return index;
     
   }
   public int lastoccurence (int [] arr,int target){
         int high=arr.length-1;
         int low=0;
         int index=-1;
         while (low<=high){
            int  mid=low+(high-low)/2;
            if (arr[mid]>target){
                high=mid-1;

            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else {
                index=mid;
                low=mid+1;
            }
         }
        return index;
   }
   public int [] searchRange (int [] nums,int target){
    return new int []{ firstoccurence(nums,target),lastoccurence(nums,target)};
   }
}