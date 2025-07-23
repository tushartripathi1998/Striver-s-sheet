// Make Zeroes

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[][] arr = {{1, 2, 3, 4},
                 {5, 6, 7, 0}, 
                 {8, 9, 4, 6},
                 {8, 4, 5, 2}};
                 
        Map<Integer, Set<Integer>> hashMap = new HashMap<>();
                 
         int n = 4;
         int m = 4;
         int sum = 0;
                 
         for (int i=0;i<n;i++) {
             for (int j=0;j<m;j++) {
             sum = 0;
                 if (arr[i][j] == 0) {
                    if (i-1 >=0)  {
                        sum += arr[i-1][j];
                        updateMap(hashMap, i-1, j);
                    }
                    if (j-1 >=0)  {
                        sum += arr[i][j-1];
                        updateMap(hashMap, i, j-1);
                    }
                    if (i+1 <n)  {
                        sum += arr[i+1][j];
                        updateMap(hashMap, i+1, j);
                    }
                    if (j+1 <m)  {
                        sum += arr[i][j+1];
                        updateMap(hashMap, i, j+1);
                    }
                    arr[i][j] = sum;
                 }
             }
         }
         hashMap.entrySet().stream().forEach(
             (k)->{
                 for(int y : k.getValue()) {
                     arr[k.getKey()][y] = 0;
                 }
                 });
                 
          for (int i=0;i<n;i++) {
              System.out.println("");
             for (int j=0;j<m;j++) {
                 System.out.print(""+arr[i][j]);
             }
          }
    }
    
    public static void updateMap(Map<Integer, Set<Integer>> hashMap, int i, int j) {
        System.out.println(i+":::"+j);
        Set<Integer> mapSet = new HashSet<>();
        if (hashMap.containsKey(i)) {
            mapSet = hashMap.get(i);
        }
        mapSet.add(j);
        hashMap.put(i, mapSet);
    }
}
