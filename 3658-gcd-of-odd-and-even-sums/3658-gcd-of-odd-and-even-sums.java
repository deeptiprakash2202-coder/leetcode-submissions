class Solution {
    public int gcdOfOddEvenSums(int n) {
        int osum=0;
        int esum=0;
        for(int i=0;i<=2*n;i++){
            if(i%2==0) esum+=i;
            else osum+=i;
        }
        return gcd(osum,esum);
    }
    int gcd(int a,int b){
     if (b == 0) {
        return a;
    }
     return gcd(b, a % b);
}
    
}