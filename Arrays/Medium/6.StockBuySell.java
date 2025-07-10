// Stock buy and sell

class Main {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int buy = arr[0];
        int prev = arr[0];
        int profit = 0;
        
        for (int i=1;i<arr.length;i++) {
            if (arr[i]>buy) {
                prev = arr[i];
            } else {
                profit = profit + prev-buy;
                buy = arr[i];
                prev = arr[i];
            }
            if (i==arr.length-1) {
                profit = profit + prev-buy;
            }
        }
        
        System.out.println("profit is : "+profit);
    }
}
