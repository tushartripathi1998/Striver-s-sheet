//Minimum number of Coins

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10 };
        int amt = 121;
        int ptr = coins.length-1;
        int count = 0;
        Arrays.sort(coins);
        int bal = 0;
        
        while (amt>0 && ptr>-1) {
            if (amt == coins[ptr]) {
                count++;
                ptr = -1;
                break;
            }
            if (amt > coins[ptr]) {
                bal = amt%coins[ptr];
                count += Integer.valueOf((amt-bal)/coins[ptr]);
                amt = bal;
            }
            ptr--;
        }
        System.out.println("count of coins is : "+count);
    }
}
