class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(max < arr[i])
                max = arr[i];
            if(max==i)
                count++;
        }
        return count;
    }
}