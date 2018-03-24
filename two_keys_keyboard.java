class Solution {
    public int minSteps(int n) {
        int steps = 0;
        if(n>=2){
            for(int i=2;i<=n;i++){
                while(n%i == 0){
                    steps += i;
                    n /= i;
                }                    
            }
        }
        return steps;
    }
}