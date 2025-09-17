class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

     for(int i =0; i<s.length(); i++){
        int idx  = s.charAt(i) - 'a';
        freq[idx]++;    
     }

      int vowelCount  = 0;
     int consCount  = 0;

        for(int i = 0; i<26; i++){
            if(i==0 || i==4 || i ==8 || i==14 || i==20){
                vowelCount = Math.max(vowelCount , freq[i]);
            }else{
                consCount = Math.max(consCount, freq[i]);
            }
        }
        return consCount + vowelCount;
     


    }
}