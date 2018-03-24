class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int abs_val = Math.abs(nums[i]);            
            if(nums[abs_val-1] > 0)
                nums[abs_val-1] = nums[abs_val-1] * (-1);
        }
        for(int i=0;i<n;i++)
            if(nums[i] > 0)
                result.add(i+1);
        return result;
    }
}