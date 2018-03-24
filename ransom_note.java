class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int mag_len = magazine.length();
        int note_len = ransomNote.length();
        if(mag_len<note_len)
            return false;
        int[] count = new int[26];
        for(int i=0;i<mag_len;i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<note_len;i++){
            count[ransomNote.charAt(i)-'a']--;
            if(count[ransomNote.charAt(i)-'a'] < 0)
                return false;
        }
        return true;
    }
}