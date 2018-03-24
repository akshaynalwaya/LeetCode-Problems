class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        if(rows==0)
            return true;
        int col = matrix[0].length;
        int i=0,j=0;
        for(i = rows-1;i>=0;i--){
            int temp = i;
            j = 1;
            while(j<col && temp<rows && temp>0){
                if(matrix[temp][j]!=matrix[temp-1][j-1])
                    return false;
                temp++;
                j++;
            }
        }
        i=0;
        j=0;
        for(j=1;j<col;j++){
            int temp = j;
            i = 0;
            while(temp < (col-1) && i < (rows-1)){
                if(matrix[i][temp] != matrix[i+1][temp+1])
                    return false;
                temp++;
                i++;
            }            
        }
        
        return true;
    }
}