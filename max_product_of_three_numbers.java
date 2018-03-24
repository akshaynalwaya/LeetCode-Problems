class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==0 || c==1)
            return true;
        int a = 0, b = (int)Math.sqrt(c);
        int temp;
        while(a<=b){
            temp = a*a + b*b;
            if(temp == c)
                return true;
            else if(temp < c)
                a += 1;
            else
                b -= 1;
        }
        return false;
    }
}