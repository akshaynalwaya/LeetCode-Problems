class Solution {
    public int arrayNesting(int[] nums) {
        
        int n = nums.length;
        int[] visited = new int[n];
        int max_length = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int j = i;
            int count = 0;
            while(visited[j]!=1){
                visited[j] = 1;
                j = nums[j];                
                count++;
            }
            max_length = Math.max(max_length,count);
        }
        return max_length;
        //can simply overwrite the visited values in nums[] with -1 to indicate they are visited
        // and won't require a visited array
    }
}