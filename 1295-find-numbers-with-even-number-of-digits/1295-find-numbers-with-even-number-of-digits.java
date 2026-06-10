class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int num=0;
        int [] ans=new int [nums.length];
        for (int i=0;i<nums.length;i++){
            int count=0;
            num=nums[i];
            while (num!=0){
                int digit=num%10;
                count ++;
                num=num/10;

            }
            ans[i]=count;   

        }
            for (int i=0;i<nums.length;i++){   
            if (ans[i]%2==0){
                c++;
            }
         }
        return c;  
    }
    
    }
