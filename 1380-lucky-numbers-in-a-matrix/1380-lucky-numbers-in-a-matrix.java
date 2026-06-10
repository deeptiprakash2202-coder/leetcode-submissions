class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans1=new   ArrayList<>();
        List<Integer> ans2=new   ArrayList<>();
            for (int i=0;i<matrix.length;i++){
                int rowmin=matrix[i][0];
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]<rowmin){
                    rowmin=matrix[i][j];
                }
          

            }
              ans1.add(rowmin);
        }
            for (int j=0;j<matrix[0].length;j++){
         int columnmax=matrix[0][j];
         for (int i=0;i<matrix.length;i++){


                if (matrix[i][j]>columnmax){
                    columnmax=matrix[i][j];
                   
                }
            }
               ans2.add(columnmax);

        }


        ans1.retainAll(ans2);
        return ans1;
             
    }
}