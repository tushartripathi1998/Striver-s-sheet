// Maximize Number of 1's

class Main {
    public static void main(String[] args) {
        int k = 2;
        int count = 0;
        int maxCount = 0;
        Boolean endFlag = false;
        
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
        
        for (int i=0;i<arr.length;i++) {
            count = 0;
            k = 2;
            for (int j=i;j<arr.length;j++) {
                if (j==arr.length-1) {
                    endFlag = true;
                }
                if (arr[j]==1) {
                    count++;
                } else {
                    if (k>0) {
                        k--;
                        count++;
                    } else {
                        break;
                    }
                }
            }
            if (maxCount<count) {
                maxCount = count;
            }
            if (endFlag) {
                break;
            }
        }
        System.out.println("output is : "+maxCount);
    }
}
