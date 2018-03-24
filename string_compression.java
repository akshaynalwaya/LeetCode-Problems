class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        int begin = 0;
        int end = 0;
        int pointer = 0;
        if(len<=1)
            return len;
        while(end<len){
            if(chars[begin] == chars[end]){
                end++;
            }
            else{
                chars[pointer++] = chars[begin];
                int count = end - begin;
                if(count>1){
                    String str = Integer.toString(count);
                    for(int i=0;i<str.length();i++)
                        chars[pointer++] = str.charAt(i);
                }                    
                begin = end;
            }
        }
        chars[pointer] = chars[begin];        

        if((end-begin)>1){            
            pointer++;
            String str = Integer.toString(end-begin);
            for(int i=0;i<str.length();i++)
                chars[pointer++] = str.charAt(i);
        }
        else
            pointer++;
        return pointer;
    }
}