class Solution {
    
    public int[][] flipAndInvertImage(int[][] image) {
        int rev[][]=new int [image.length][image[0].length];
        int invert[][]=new int [image.length][image[0].length];
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[i].length;j++){
                rev[i][j]=image[i][image[i].length-1-j];
            }
        }
        for (int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
               if (rev[i][j]==0){
                invert[i][j]=1;
               }
               else if( rev[i][j]==1){
                invert[i][j]=0;
               }
            }
            
        }
        return invert;
    }
}