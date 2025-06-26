// Longest consecutive ones

class Main {
    public static void main(String[] args) {
        int n = 143;
        int currentCount = 0;
        int largestCount = 0;
        Boolean flag = false;
        String num = Integer.toBinaryString(n);
        for (int i=0;i<num.length();i++) {
            currentCount = 0;
            for (int j=i;j<num.length();j++) {
                if (num.charAt(j)=='1') {
                    currentCount++;
                    if (j==num.length()-1) {
                        if (currentCount>largestCount) {
                        largestCount = currentCount;
                    }
                        flag = true;
                        break;
                    }
                } else {
                    if (currentCount>largestCount) {
                        largestCount = currentCount;
                    }
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println("the count is : "+largestCount);
    }
}
