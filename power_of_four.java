class Solution {
    public boolean isPowerOfFour(int num) {
        double ans = Math.log10(num)/Math.log10(4);
        //added base 4 to avoid precision errors
        if(ans%1==0)
            return true;
        return false;
    }
}