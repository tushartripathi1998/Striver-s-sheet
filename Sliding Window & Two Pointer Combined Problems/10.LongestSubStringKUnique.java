import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        int j=0;
        int maxSize = 0;
        Character existing = null;
        Map<Character, Integer> counterSet = new HashMap<>();
        
        for (int i=0;i<s.length();i++) {
            char current = s.charAt(i);
            counterSet.put(current,
                counterSet.getOrDefault(current, 0)+1);
            while (counterSet.size() > k) {
                existing = s.charAt(j);
                counterSet.put(existing, counterSet.get(existing) - 1);
                if (counterSet.get(existing) == 0) {
                    counterSet.remove(existing);
                }
                j++;
            }
            if (maxSize<i-j+1) {
                maxSize = i-j+1;
            }
            System.out.println("Max size is : "+maxSize);
        }
        
    }
}
