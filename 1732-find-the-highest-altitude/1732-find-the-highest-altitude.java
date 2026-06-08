class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int ans[]=new int [gain.length+1];
        ans[0]=0;
        for (int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            ans[i+1]=alt;
            

        }
         int max=ans[0];
        for (int i=0;i<ans.length;i++){
            if (ans[i]>max){
                max=ans[i];
            }
        }
        return max;
    }
}