class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int children = g.length;
        int cookies = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while(i<children && j<cookies){
            if(g[i] <= s[j])
                i++;
            j++;
        }        
        return i;
    }
}