// Smallest window containing all characters of another string
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        String s1 = "timetopractice";
        String s2 = "toc";
        Set<Character> subsetContainer = null;
        int j=0;
        int minCount = s1.length();
        String minString = null;
        
        for (int i=0;i<s1.length();i++) {
            subsetContainer = getSubsetChar(s2);
            j=i;
            while (subsetContainer.size() > 0 && j<s1.length()) {
                if(subsetContainer.contains(s1.charAt(j))){
                    subsetContainer.remove(s1.charAt(j));
                }
                if (subsetContainer.size() ==0 && minCount > j-i-1) {
                    minCount = j-i+1;
                    minString = i+"_"+j;
                }
                j++;
            }
        }
        System.out.println(minString);
    }
    
    public static Set<Character> getSubsetChar(String s2){
        return s2
        .chars()
        .mapToObj(ch->(char)ch)
        .collect(Collectors.toSet());
    }
    
}
