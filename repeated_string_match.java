class Solution {
    public int repeatedStringMatch(String A, String B) {
        String temp = "";
        int res = 0;
        while(temp.length() < B.length()){
            temp += A;
            res++;
        }
        if(temp.contains(B))
            return res;
        else if((temp+A).contains(B))
            return (res+1);
        else
            return -1;
    }
}
