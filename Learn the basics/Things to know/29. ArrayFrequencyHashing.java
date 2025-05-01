// Input: arr[] = [2, 3, 2, 3, 5]
// Output: [0, 2, 2, 0, 1]
// Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 
// 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> hashArrayList = new ArrayList<Integer>(arr.length);
        int[] hashArray = new int[arr.length];
        for (int element : arr) {
            hashArray[element-1]++;
        }
        for (int element : hashArray) {
            hashArrayList.add(element);
        }
        return hashArrayList;
    }
}
