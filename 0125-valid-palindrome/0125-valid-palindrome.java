class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        Stack <Character> stack=new Stack<>();
        String string=s.toLowerCase();
        for (char ch:string.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                sb.append(ch);
                stack.push(ch);
            }

        }
        StringBuilder reverse =new StringBuilder();
        while (!stack.isEmpty()){
            reverse.append(stack.pop());
        }
         return sb.toString().equals(reverse.toString());
    }

     
}
