//Bus Ticket Change

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] passMoney = {5, 5, 5, 10, 20};
        int ptr = 0;
        int pocket = 0;
        int currentAmt = 0;
        Boolean possible = true;
        
        while (ptr < passMoney.length) {
            currentAmt = Integer.valueOf(passMoney[ptr]/5);
            if (currentAmt == 1) {
                ++pocket;
                ++ptr;
                continue;
            }
            if (currentAmt > 1 && pocket-(currentAmt-1) >=0) {
                pocket = pocket-(currentAmt-2);
                ++ptr;
                continue;
            }
            possible = false;
            break;
        }
        System.out.println(possible ? "possible" : "not possible");
    }
}
