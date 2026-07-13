class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for (char ch:s.toCharArray()){
            if (stack.isEmpty()){
                stack.push(ch);
            }
            else if (ch==stack.peek()){
                stack.pop();
            
            }
            else stack.push(ch);


            
        }
        for (char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}