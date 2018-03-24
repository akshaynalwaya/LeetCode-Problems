class Solution {
    public int arrangeCoins(int n) {
        long x = (long)n;
        return (int)((Math.sqrt(1+8*x)-1)/2);
    }
}