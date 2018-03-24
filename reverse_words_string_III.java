class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        if(len==0)
            return "";
        Queue<String> queue = new LinkedList<>();
        String result = "";
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                queue.add(result);
                result = "";
            }
            else{
                result = s.charAt(i) + result;
            }
        }
        if(result.length()!=0)
            queue.add(result);
        result = "";
        while(!queue.isEmpty())
            result += queue.poll() + " ";
        return result.substring(0,result.length()-1);
    }
}