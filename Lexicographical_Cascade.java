import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "aabdcab";
        
        int[] letter = new int[26];
        
        // Count frequency of characters
        for (char ch : str.toCharArray()) {
            letter[ch - 'a']++;
        }
        
        // Use total to track how many characters remain
        int total = str.length();
        StringBuilder sb = new StringBuilder(str.length());
        
        while (total > 0) {
            for (int i = 0; i < 26; i++) {
                if (letter[i] > 0) {
                    sb.append((char) ('a' + i));
                    letter[i]--;
                    total--;
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}
