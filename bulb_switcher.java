class Solution {
    public int bulbSwitch(int n) {
        if(n==0)
            return 0;
        int i = 3;
        int sum = 0;
        int k = 0;
        while(n > sum){
            sum += i;
            i += 2;
            k++;
        }
        return k;
    }
}