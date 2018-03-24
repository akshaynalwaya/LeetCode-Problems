class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        int len = moves.length();
        int i=-1;
        while(++i < len){
            if(moves.charAt(i)=='R')
                x+=1;
            if(moves.charAt(i)=='L')
                x-=1;
            if(moves.charAt(i)=='U')
                y+=1;
            if(moves.charAt(i)=='D')
                y-=1;
        }
        if(x==0){
            if(y==0)
                return true;
            return false;
        }
        return false;
    }
}