class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x_upper = m;
        int y_upper = n;
        int rows = ops.length;        
        for(int i=0;i<rows;i++){
            x_upper = Math.min(x_upper,ops[i][0]);
            y_upper = Math.min(y_upper,ops[i][1]);
        }
        return x_upper*y_upper;
    }
}