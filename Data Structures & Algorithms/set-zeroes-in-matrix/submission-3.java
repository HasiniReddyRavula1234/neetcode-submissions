class Solution {
    public void setZeroes(int[][] matrix) {
        int n = 0, m = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] r = new boolean[rows];
        boolean[] c = new boolean[cols];
        for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    r[i] = true;
                    c[j] = true;
                  
                }
            }
        }
         for(int i = 0;i < matrix.length;i++){
            for(int j = 0;j < matrix[0].length;j++){
                
                   if(r[i] || c[j] )
                   matrix[i][j] = 0;
                
            }
        }
        
    }
}
