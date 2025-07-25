import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int lowest=-1, highest=-1, mid=-1;
        Character firstElement = null;
        Character midElement = null;
        Character lastElement = null;
        int maxSize = 0;
        Set<Character> counterSet = new HashSet<>();
        
        for (int i=0;i<s.length();i++) {
            if (!counterSet.contains(s.charAt(i))) {
                System.out.println("s.charAt(i)"+s.charAt(i)+":"+i+"::"+counterSet.size());
                if (counterSet.size()<3) {
                    if (firstElement==null) {
                        firstElement = s.charAt(i);
                        lowest = i;
                    } else if (midElement==null) {
                        midElement = s.charAt(i);
                        mid = i;
                    }
                } else {
                    counterSet.remove(firstElement);
                    System.out.println("first and last "+lowest+"::"+highest);
                    
                    firstElement = midElement;
                    lowest = mid;
                    midElement = lastElement;
                    mid = highest;
                }
                counterSet.add(s.charAt(i));
                highest = i;
                lastElement = s.charAt(i);
                
            }
            if (i==s.length()-1) {
                    highest = i;
                }
                if (highest-lowest > maxSize) {
                    maxSize = highest-lowest;
                }
        }
        
    }
}
