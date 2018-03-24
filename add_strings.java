class Solution {
    public String addStrings(String num1, String num2) {
        
        int len1 = num1.length();
        int len2 = num2.length();
        int i = Math.max(len1,len2)-1;
        String result = "";
        int a = 0, b = 0,sum = 0,carry=0;
        int j = len1 - 1;
        int k = len2 - 1;
        while(i >= 0){
            a = (j<0) ? 48 : (int)num1.charAt(j--);
            b = (k<0) ? 48 : (int)num2.charAt(k--);
            sum = a+b;
            int temp = sum - 48;
            if(carry == 1)
                temp++;
            if(temp>57){
                carry = 1;                
                temp -= 10;                
            }
            else
                carry = 0;                
            result = (char)temp + result;
            i--;
        }
        if(carry==1)
            result = carry + result;
        return result;
    }
}