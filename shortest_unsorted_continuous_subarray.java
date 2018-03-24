class Solution {
    public int findUnsortedSubarray(int[] nums) {        
        int len = nums.length;
        if(len<2)
            return 0;
        int start = 0;
        int end = len-1;
        int i=0;
        while(i<len && start<end){
            if(nums[start] == getMin(nums,start,end) && nums[end] == getMax(nums,start,end)){
                start++;
                end--;
            }
            else if(nums[end] == getMax(nums,start,end))
                end--;
            else if(nums[start] == getMin(nums,start,end))
                start++;
            else
                break;
            i++;   
        }
        if(start==end)
            return 0;
        return (end-start+1);
    }
    
    int getMin(int[] nums, int start, int end){
        int min = Integer.MAX_VALUE;
        for(int i=start;i<=end;i++){
            if(nums[i] < min)
                min = nums[i];
        }        
        return min;
    }
    int getMax(int[] nums,int start, int end){
        int max = Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            if(nums[i] > max)
                max = nums[i];
        }        
        return max;
    }
}