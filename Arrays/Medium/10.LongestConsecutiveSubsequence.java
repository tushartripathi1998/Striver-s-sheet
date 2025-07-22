// Longest consecutive subset
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        Set<Integer> arrNums = Arrays.stream(arr).boxed().
        collect(Collectors.toSet());
        int maxCount = 0;
        
        for (Integer num : arrNums) {
            int currentNum = 0;
            int count = 0;
            if (!arrNums.contains(num-1)) {
                currentNum = num;
                ++count;
                while (arrNums.contains(++currentNum)) {
                    ++count;
                }
                if (maxCount < count) {
                    maxCount = count;
                }
            }
        }
        System.out.println("Longest consecutive subset:"+maxCount);
    }
}
