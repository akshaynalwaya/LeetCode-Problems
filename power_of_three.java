class Solution {
    public boolean isPowerOfThree(int n) {
        double ans = Math.log10(n)/Math.log10(3);
        if(ans%1==0)
            return true;
        return false;        
    }
}

