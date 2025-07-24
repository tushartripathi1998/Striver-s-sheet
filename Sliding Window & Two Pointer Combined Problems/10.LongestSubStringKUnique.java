import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "aabacbebebeddr";
        int lowest=-1, highest=-1, mid=-1;
        Character firstElement = null;
        Character midElement = null;
        Character lastElement = null;
        Map<Character, Integer> counterMap = new HashMap<>();
        
        for (int i=0;i<s.length();i++) {
            // System.out.println("num "+s.charAt(i));
            if (!counterMap.containsKey(s.charAt(i))) {
                System.out.println("s.charAt(i)"+s.charAt(i)+":"+i+"::"+counterMap.size());
                if (counterMap.size()<=3) {
                    if (firstElement==null) {
                        firstElement = s.charAt(i);
                        lowest = i;
                    }
                    if (midElement==null) {
                        midElement = s.charAt(i);
                        mid = i;
                    }
                } else {
                    counterMap.remove(firstElement);
                    System.out.println("first and last "+lowest+"::"+highest);
                    firstElement = midElement;
                    lowest = mid;
                    midElement = lastElement;
                    lowest = highest;
                }
                counterMap.put(s.charAt(i), i);
                lastElement = s.charAt(i);
                highest = i;
            }
        }
    }
}
