class Solution {
    public int findLength(int[] A, int[] B) {
        int n1 = A.length;
        int n2 = B.length;
        int[][] mem = new int[n1+1][n2+1];
        int max = 0;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(A[i-1]!=B[j-1])
                    mem[i][j] = 0;                
                else{
                    mem[i][j] = mem[i-1][j-1] + 1;
                    /*if(mem[i-1][j-1]>0)
                        mem[i][j] = mem[i-1][j-1] + 1;
                    else
                        mem[i][j] = 1;
                    */
                }
                if(mem[i][j] > max)
                    max = mem[i][j];
            }
        }
        return max;
    }
}