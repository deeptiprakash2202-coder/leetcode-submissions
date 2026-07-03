class Solution {
    public String defangIPaddr(String address) {
     
     char [] arr=address.toCharArray();
     StringBuilder sb=new StringBuilder ();

     for (char c:arr){
        if (c =='.'){
            sb.append("[.]");
        }
        else sb.append(c);
     }
     return sb.toString();

    }
    
}