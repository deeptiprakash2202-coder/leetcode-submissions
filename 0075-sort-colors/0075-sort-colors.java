class Solution {
    public void sortColors(int[] nums) {
        int [] ans=new int [nums.length];
        int countzero=0;
        int countone=0;
        int counttwo=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                countzero++;
            }
            else if (nums[i]==1){
                countone++;
            }
            else if (nums[i]==2){
                counttwo++;
            }
        }
        int i=0;
        while (countzero-->0){
            ans[i++]=0;

        }
        while (countone-->0){
            ans[i++]=1;
        }
        while (counttwo-->0){
            ans[i++]=2;

        }
        for (int j=0;j<nums.length;j++){
            nums[j]=ans[j];
        }

    
    }
}