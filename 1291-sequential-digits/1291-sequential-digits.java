class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        
        String digits="123456789";
        int lowlength=String.valueOf(low).length();
        int highlength=String.valueOf(high).length();
        for (int len=lowlength;len<=highlength;len++){
            for (int start=0;start<=9-len;start++){
             String sub=digits.substring(start,start+len);
              int num=Integer.parseInt(sub);
               

               if (num>=low && num<=high){
            ans.add(num);
        }
            }
        }
        
        return ans;
    }
}