class Solution {
    public int[] findErrorNums(int[] nums) {        
        Arrays.sort(nums);        
        int len = nums.length;
        int[] numbers = new int[len];        
        for(int i=0;i<len;i++){
            numbers[nums[i]-1]++;
        }
        int[] res = new int[2];
        res[0] = res[1] = -1;
        for(int i=0;i<len;i++){
            if(numbers[i] == 0)
                res[1] = i+1;
            else if(numbers[i] > 1)
                res[0] = i+1;
        }
        return res;
    }    
}