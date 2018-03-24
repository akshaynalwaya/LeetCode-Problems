class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();        
        for(int i=len/2;i>0;i--){
            if(len%i==0){
                int sub_len = len/i;
                String temp = s.substring(0,i);
                StringBuilder str = new StringBuilder();
                for(int j=0;j<sub_len;j++){
                    str.append(temp);
                }
                if(str.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}