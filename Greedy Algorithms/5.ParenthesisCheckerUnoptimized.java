//Parenthesis Checker Unoptimized

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        String passMoney = "[{()}]";
        int sqBracket = 0;
        int cirBracket = 0;
        int angBracket = 0;
        
        for (int i=0;i<passMoney.length();i++) {
            if (passMoney.charAt(i)=='[') {
                ++sqBracket;
            } else if (passMoney.charAt(i)==']') {
                --sqBracket;
            } else if (passMoney.charAt(i)=='(') {
                ++cirBracket;
            } else if (passMoney.charAt(i)==')') {
                --cirBracket;
            } else if (passMoney.charAt(i)=='{') {
                ++angBracket;
            } else if (passMoney.charAt(i)=='}') {
                --angBracket;
            }
        }
        
        if (sqBracket == 0 && cirBracket == 0 && angBracket == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
