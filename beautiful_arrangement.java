class Solution {
    int permutations = 0;
    public int countArrangement(int N) {
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = i+1;
        find_permutations(arr,0);
        return permutations;
    }
    
    public void find_permutations(int[] arr, int x){
        int len = arr.length;
        if(x == len)
            permutations++;
        else{
            for(int i=x;i<len;i++){
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                
                if(arr[x]%(x+1) == 0 || (x+1)%arr[x] == 0){
                    //valid permutation till now, move to next index
                    find_permutations(arr,x+1);
                }
                //reverse the swapping
                temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                
            }
        }
    }
}