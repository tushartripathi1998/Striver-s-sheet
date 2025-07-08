// Count Subarray with k odds

class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k = 3;
        int countK = 0;
        
        for (int i=0;i<arr.length;i++) {
            countK = 0;
            for (int j=i;j<arr.length;j++) {
                if (arr[j]%2!=0){
                    countK++;
                    if (countK == k) {
                        System.out.println("["+i+","+j+"]");
                        break;
                    }
                }
            }
        }
    }
}
