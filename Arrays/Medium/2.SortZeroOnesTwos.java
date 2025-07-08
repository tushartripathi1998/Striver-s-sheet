// Sort 0s, 1s and 2s

class Main {
    public static void main(String[] args) {
        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;
        
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] modifiedArr = new int[arr.length];
        int i=0;
        countTwos = arr.length-1;
        
        while(i<arr.length) {
            if (arr[i]==0) {
                modifiedArr[countZeros] = 0;
                countZeros++;
            }
            if (arr[i]==2) {
                modifiedArr[countTwos] = 2;
                countTwos--;
            }
            i++;
        }
        while(countZeros<countTwos+1){
            modifiedArr[countZeros] = 1;
            countZeros++;
        }
        
        for (int j=0;j<arr.length;j++) {
            System.out.println("->"+modifiedArr[j]);
        }
    }
}
