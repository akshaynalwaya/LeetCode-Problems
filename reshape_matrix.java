class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        if(rows*cols != r*c)
            return nums;
        int[] temp_arr = new int[r*c];
        int k=0;
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                temp_arr[k++] = nums[i][j];
        k=0;
        int[][] new_arr = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                new_arr[i][j] = temp_arr[k++];
        return new_arr;
    }
}