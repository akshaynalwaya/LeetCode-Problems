class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] plate = new int[26];
        int len = licensePlate.length();
        for(int i=0;i<len;i++){
            if(licensePlate.charAt(i) <= 'z' && licensePlate.charAt(i) >= 'a')
                plate[licensePlate.charAt(i)-97]++;
        }
        String result = "";
        int result_len = Integer.MAX_VALUE;
        int word_count = words.length;
        for(int i=0;i<word_count;i++){
            int[] temp = new int[26];
            int word_len = words[i].length();
            for(int j=0;j<word_len;j++){
                if(words[i].charAt(j) <= 'z' && words[i].charAt(j) >= 'a')
                    temp[words[i].charAt(j)-97]++;
            }

            if(check_equality(temp,plate)){
                if(result_len > words[i].length()){
                    result_len = words[i].length();
                    result = words[i];
                }
            }
            
        }
        return result;
    }
    
    boolean check_equality(int[] arr1, int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i] < arr2[i])
                return false;
        }
        return true;
    }
    
}