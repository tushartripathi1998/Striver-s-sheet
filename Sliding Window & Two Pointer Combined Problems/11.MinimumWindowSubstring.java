// Smallest window containing all characters

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String mainStr = "ddaaabbcca";
        String searchStr = "abc";
        int l=0, r=0;
        int count = 0;
        int minLength = mainStr.length();
        Map<Character, Long> stringMap = searchStr
        .chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        for (int i=0;i<mainStr.length();i++) {
            if (stringMap.containsKey(mainStr.charAt(i))) {
                stringMap.put(mainStr.charAt(i), stringMap.get(mainStr.charAt(i))-1);
                if (stringMap.get(mainStr.charAt(i))>=0) {
                    ++count;
                }
            }
            while (count==searchStr.length()) {
                System.out.println("left and right are : "+l+":"+r);
                if (r-l+1 < minLength) {
                    minLength = r-l+1;
                }
                if (stringMap.containsKey(mainStr.charAt(l))) {
                    stringMap.put(mainStr.charAt(l), stringMap.get(mainStr.charAt(l))+1);
                    if (stringMap.get(mainStr.charAt(l))>0) {
                        --count;
                    }
                }
                l++;
            }
            r++;
        }
        System.out.println("minimum length is : "+minLength);
    }
}
