class Solution {
    public int calPoints(String[] operations) {
      Stack<Integer> stack=new Stack<>();
      for (int i=0;i<operations.length;i++){
           if (operations[i].equals("+")){
                if (stack.isEmpty()){
                    continue;
                }
             int a=   stack.pop();
               int b= stack.pop();
               int sum=a+b;
            stack.push(b);
            stack.push(a);
            stack.push(sum);

           }
          else if (operations[i].equals("D")){
                if (stack.isEmpty()){
                    continue;
                }
              int x=stack.pop();
              int doubled=x*2;
              stack.push(x);
              stack.push(doubled);
           }
          else if (operations[i].equals("C")){
               stack.pop();
           }
          else {

            int num=Integer.parseInt(operations[i]);
            stack.push(num);
          }
      }
      int finalsum=0;
      for (int score:stack){
        finalsum=finalsum+score;
      }
      return finalsum;
      
    }
}