// Longest subarray with Atmost two distinct integers

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Set<Integer> maxNums = new HashSet<>();
        int[] arr = {3, 1, 2, 2, 2, 2};
        int currentCount = 0;
        int maxCount = 0;
        Boolean endFlag = false;
        
        for (int j=0;j<arr.length;j++) {
            currentCount = 0;
            maxNums = new HashSet<>();
            for (int i=j;i<arr.length;i++) {
                if (maxNums.contains(arr[i])||maxNums.size()<2) {
                    if (!maxNums.contains(arr[i])) {
                        maxNums.add(arr[i]);
                    }
                    currentCount++;
                    if (i==arr.length-1) {
                        endFlag = true;
                    }
                }
                else {
                    break;
                }
            }
            if (maxCount<currentCount) {
                maxCount = currentCount;
            }
            if(endFlag) {
                break;
            }
        }
        System.out.println("Max count is : "+maxCount);
    }
}
