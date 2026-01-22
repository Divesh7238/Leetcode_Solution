import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            
            
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                
                
                if (isVowel(ch)) {
                    set.add(ch);
                   
                    if (set.size() == 5) {
                        count++;
                    }
                } else {
                    break; 
                }
            }
        }
        return count;
    }

    
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}