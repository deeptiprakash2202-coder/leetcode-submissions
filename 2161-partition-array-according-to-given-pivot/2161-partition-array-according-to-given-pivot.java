class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less= new ArrayList<>();
        ArrayList<Integer> more=new ArrayList<>();
        ArrayList<Integer> equal=new ArrayList<>();

        for (int num:nums){
            if (num<pivot){
                less.add(num);
            }
            else if (num>pivot){
                more.add(num);
            }
            else {
                equal.add(num);
            }
        }
        int ans[]=new int [nums.length];
        int k=0;
        for (int x:less){
             ans[k++]=x;
        }
        for (int x:equal){
            ans[k++]=x;
        }
        for (int x:more){
            ans[k++]=x;
        }

        return ans;

    }
}