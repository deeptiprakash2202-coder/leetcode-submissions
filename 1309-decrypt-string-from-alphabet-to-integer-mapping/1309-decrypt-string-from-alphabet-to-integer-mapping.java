class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int  i=s.length()-1;
        while (i>=0){
            if (s.charAt(i)=='#'){
               String num=s.substring(i-2,i);

            
            int value=Integer.parseInt(num);
            char ch=(char)('a'+value-1);
            sb.append(ch);
            i=i-3;
            }
         else {
            int num=s.charAt(i)-'0';
            char ch=(char)('a'+num-1);
            sb.append(ch);
            i--;
           }
        }
        return (sb.reverse().toString());
    }
}