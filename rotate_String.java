class Solution {
    public boolean rotateString(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if(lenA!=lenB)
            return false;
        String result = A+A;
        return result.contains(B);
        /*
        int lenA = A.length();
        int lenB = B.length();
        if(lenA!=lenB)
            return false;
        if(lenA==0)
            return true;
        for(int i=0;i<lenA;i++){
            if(A.equals(B))
                return true;
            else
                A = left_rotate(A.toCharArray());            
        }
        return false;
        */
    }
    /*
    public String left_rotate(char[] s){
        int n = s.length;
        char temp = s[0];
        for(int i=1;i<n;i++)
            s[i-1] = s[i];
        s[n-1] = temp;
        String res = String.valueOf(s);
        return res;
    }*/
}