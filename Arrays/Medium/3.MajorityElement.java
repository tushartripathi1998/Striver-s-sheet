// Majority Element
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 2, 1, 3, 5, 1, 5, 5};
        int minNo = arr.length/2;
        int majorityElement = -1;
        Map<Integer, Integer> auditMap = new HashMap<>();
        for (int i=0;i<arr.length;i++) {
            if (auditMap.containsKey(arr[i])) {
                auditMap.put(arr[i], auditMap.get(arr[i])+1);
                if (auditMap.get(arr[i]) > minNo) {
                    majorityElement = arr[i];
                    break;
                }
            } else {
                auditMap.put(arr[i], 1);
                if (auditMap.get(arr[i]) > minNo) {
                    majorityElement = arr[i];
                    break;
                }
            }
        }
        System.out.println("Majority element is : "+majorityElement);
    }
}
