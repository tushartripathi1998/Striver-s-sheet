// Length of longest sub-string
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String a = "geeksforgeeks";
        StringBuffer longestString = new StringBuffer("");
        String longestSub = new String("");
        
        Map<Character,Integer> existingSeries = new HashMap<>();
        
        for (int i=0;i<a.length();i++) {
                existingSeries = new HashMap<>();
                longestString.setLength(0);
            for(int j=i;j<a.length();j++) {
                if(!existingSeries.containsKey(a.charAt(j))){
                    existingSeries.put(a.charAt(j), 1);
                    longestString.append(a.charAt(j));
                } else {
                    if (longestSub.length()<longestString.length()){
                        longestSub = longestString.toString();
                    }
                    break;
                }
            }
        }
    }
}
