// Binary subarray with sum

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        int sum = 2;
        int calculatedSum = 0;
        
        for (int i=0;i<arr.length;i++) {
            calculatedSum = 0;
            for (int j=i;j<arr.length;j++) {
                calculatedSum = arr[j] + calculatedSum;
                if (calculatedSum > sum) {
                    break;
                } else {
                    if (calculatedSum == sum) {
                        System.out.println("set-["+i+","+j+"]");
                    }
                }
            }
        }
    }
}
