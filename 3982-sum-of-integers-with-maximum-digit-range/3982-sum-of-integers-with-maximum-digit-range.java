class Solution {
    public int maxDigitRange(int[] nums) {
        int[] arr=new int [nums.length];
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            arr[i]=range(nums[i]);
            maxx=Math.max(maxx,arr[i]);
        }
        int sum=0;
         for(int i=0;i<nums.length;i++){
            if(arr[i]==maxx){
               sum+=nums[i];

            }
         }
         return sum;
    }
    public int range(int n){
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
      while(n>0){
        int r=n%10;
        mx=Math.max(mx,r);
        mn=Math.min(mn,r);
        n=n/10;

      }
      return mx-mn;

    }
}