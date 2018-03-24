class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        if(target <= 1)
            return target;
        int sum = 0;
        int n = 0;        
        while(sum<target){
            n++;
            sum = sum + n;
        }
        int delta = sum - target;
        if(delta%2==0)
            return n;
        else{
            n++;
            sum += n;
            delta = sum - target;
            if(delta%2==0)
                return n;
            n++;
            return n;
        }
    }
}