class Solution {
    public void reverseString(char[] s) {
        Stack <Character> stack=new Stack<>();
        for (char ch:s){
            stack.push(ch);
        }
          int i=0;
        while (!stack.isEmpty()){
            s[i++]=stack.pop();
        }

    }
}