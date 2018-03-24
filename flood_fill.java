class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int old_col = image[sr][sc];
        if(old_col == newColor)
            return image;
        Flood_Fill(image,sr,sc,old_col,newColor);
        return image;
    }
    
    private void Flood_Fill(int[][] image, int row, int col, int old_color, int newColor) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != old_color){
            return;
        }
        image[row][col] = newColor;
        Flood_Fill(image,row +1,col,old_color,newColor);
        Flood_Fill(image,row -1,col,old_color,newColor);
        Flood_Fill(image,row,col+1,old_color,newColor);
        Flood_Fill(image,row,col-1,old_color,newColor);
    }

}