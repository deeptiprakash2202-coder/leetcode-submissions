class Solution {
    public long sumAndMultiply(int n) {
       StringBuilder sb=new StringBuilder();
       int sum=0;
       long x=0;
       while (n>0){

        int digit=n%10;
        if (digit!=0){
            sb.append(digit);
             sum=sum+digit;
        }
       
        n=n/10;
      
       }
       if (sb.length()==0){
        return 0;
       }
        x=Long.parseLong(sb.reverse().toString());
       return (x*sum);
    }
}