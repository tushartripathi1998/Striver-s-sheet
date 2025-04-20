// Input: n = 2446
// Output: 1
// Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

class Solution {
    static int evenlyDivides(int n) {
        // code here
        List<String> numbers = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        int count = 0;
        int number = 0;
        Iterator<String> i = numbers.iterator();
        while(i.hasNext()) {
            number = Integer.parseInt(i.next());
            if (number != 0 && n%number == 0){
                count++;
            }
        }
        return count;
    }
}
