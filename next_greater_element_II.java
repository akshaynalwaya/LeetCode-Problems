class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if(n==0)
            return res;
        Stack<Integer> stk = new Stack<>();
        int i = n*2 - 1;
        while(i>=0){
            while(!stk.isEmpty()){
                int temp = stk.peek();
                if(nums[temp] > nums[i%n]){
                    stk.push(temp);
                    break;
                }
                else
                    stk.pop();
            }
            if(stk.isEmpty())
                res[i%n] = -1;                
            else{
                int temp = stk.peek();
                res[i%n] = nums[temp];            
            }
                
            stk.push(i%n);
            i--;
        }
        return res;
    }
}