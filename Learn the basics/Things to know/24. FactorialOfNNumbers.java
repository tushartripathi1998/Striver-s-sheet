// A number n is called a factorial number if it is the factorial of a positive integer. 
// For example, the first few factorial numbers are 1, 2, 6, 24, 120,...

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        return generateFactorialNumber(new ArrayList<Long>(), 1, 1, n);
    }
    
    public static ArrayList<Long> generateFactorialNumber(
        ArrayList<Long> factorialList, int count, int factorialCurrentVal, long num){
        if (factorialCurrentVal*count<num) {
            factorialList.add(Long.valueOf(factorialCurrentVal*count));
            return generateFactorialNumber(factorialList, count+1, factorialCurrentVal*count, num);
        }
        return factorialList;
    }
}
