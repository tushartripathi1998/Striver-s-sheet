// Assign Cookies

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] greed = {1, 10, 3};
        int[] cookie = {1, 2, 3};
        int catered = 0;
        int cookieCount = 0;
        int cookieTotal = 0;
        
        Arrays.sort(greed);
        Arrays.sort(cookie);
        
        for (int greedCount : greed) {
            cookieTotal = 0;
            for (int j=cookieCount;j<cookie.length;j++) {
                cookieTotal = cookieTotal + cookie[j];
                if (cookieTotal>=greedCount) {
                    catered++;
                    break;
                }
            }
        }
        System.out.println("catered is : "+catered);
    }
}
