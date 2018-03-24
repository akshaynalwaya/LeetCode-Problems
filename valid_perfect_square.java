class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        long sum = 0;
        long n = num;
        while(sum < n){
            sum += i;
            i += 2;
        }
        if(sum == n)
            return true;
        return false;
    }
}