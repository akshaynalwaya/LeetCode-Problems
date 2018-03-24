class Solution {
    public String[] findRelativeRanks(int[] nums) {
        
        int len = nums.length;
        String[] res = new String[len];
        int[][] temp = new int[len][2];
        for(int i=0;i<len;i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }            
        Arrays.sort(temp,(a,b) -> b[0] - a[0]);
        for(int i=0;i<len;i++){
            if(i==0){
                res[temp[i][1]] = "Gold Medal";
            }
            else if(i==1){
                res[temp[i][1]] = "Silver Medal";
            }
            else if(i==2){
                res[temp[i][1]] = "Bronze Medal";
            }
            else{
                res[temp[i][1]] = String.valueOf(i+1);
            }
        }
        return res;
    }
}