class Solution {
    public boolean checkValidString(String s) {
        Stack open = new Stack();
        Stack close = new Stack();
        Stack star = new Stack();
        
        int len = s.length();
        int i=0;
        while(i<len){
            if(s.charAt(i)=='(')
                open.push(i);
            else if(s.charAt(i)=='*'){
                star.push(i);
            }
            else if(s.charAt(i)==')'){
                if(open.isEmpty() && star.isEmpty())
                    return false;
                else{
                    if(!open.isEmpty())
                        open.pop();
                    else if(!star.isEmpty())
                        star.pop();
                }
            }
            i++;
        }
        while(!open.isEmpty() && !star.isEmpty()){
            if((int)open.pop() > (int)star.pop())
                return false;
        }
        return open.isEmpty();
    }
}