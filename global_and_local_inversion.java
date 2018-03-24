class Solution {
    public boolean isIdealPermutation(int[] A) {
        int n = A.length;

        for(int i=0;i<n-1;i++){
            if(A[i] > A[i+1]){
                if(A[i]==(i+1) && A[i+1]==i)
                    continue;
                else{
                    return false;
                }
            
            }                
        }
        
        return true;
    }
}