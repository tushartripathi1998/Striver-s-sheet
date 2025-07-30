// Longest Substring with K Uniques

import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int l=0, r=0;
        int max = 0;
        Character currentChar = null;
        Map<Character, Integer> countCh = new HashMap<>();
        
        while (l<s.length() && r<s.length()) {
            if (r-l+1 > max && countCh.size() <= k) {
                max = r-l+1;
            }
            
            currentChar = s.charAt(r);
            countCh.put(currentChar, countCh.getOrDefault(currentChar, 0)+1);
            while (countCh.size() > k) {
                currentChar = s.charAt(l);
                countCh.put(currentChar, countCh.getOrDefault(currentChar, 0)-1);
                if (countCh.get(currentChar) < 1) {
                    countCh.remove(currentChar);
                }
                l++;
            }
            r++;
        }
        System.out.println("max is : "+max);
    }
}
