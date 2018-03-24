class Solution {
    public boolean checkRecord(String s) {
        int len = s.length();
        int absent = 0;
        int late = 0;
        if(len<3){
            for(int i=0;i<len;i++){
                if(s.charAt(i)=='A')
                    absent++;
                if(absent>1)
                    return false;
            }
            return true;
        }
        if(s.charAt(0)=='A')
            absent++;
        if(s.charAt(1)=='A')
            absent++;

        for(int i=2;i<len;i++){
            if(s.charAt(i)=='A')
                absent++;
            if(absent>1)
                return false;
            if(s.charAt(i-2)=='L' && s.charAt(i-1) == 'L' && s.charAt(i)=='L')
                return false;
        }
        return true;
    }
}