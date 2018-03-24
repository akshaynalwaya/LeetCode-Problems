class Solution {
    public int monotoneIncreasingDigits(int N) {
        int len = Integer.toString(N).length();
        int digits[] = new int[len];
        int temp = N;
        for(int i=len-1;i>=0;i--){
            digits[i] = temp%10;
            temp = temp/10;
        }
        if(check_monotone(digits,len))
            return N;
        else{
            int flag=0;
            int j=len-1;
            while(j>0){
                if(flag!=1){
                    digits[j] = 9;
                    if(digits[j-1] > 0)
                        digits[j-1]--;
                    else 
                        digits[j-1] = 0;                
                    if(check_monotone(digits,len)){
                        flag=1;
                    }
                }
                j--;
            }
            j=0;
            int res=0;
            while(j<len){
                res = res*10 + digits[j];
                j++;
            }
            return res;
        }
        
    }
    
    public boolean check_monotone(int[] x, int len){
        int i=1;
        while(i<len){
            if(x[i-1] > x[i])
                return false;
            i++;
        }
        return true;
    }
    
}