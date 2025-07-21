// Array Leaders

class Main {
    public static void main(String[] args) {
        System.out.println("Array Leaders");
        int[] arr = {16, 17, 4, 3, 5, 2};
        int highest = -1;
        
        for (int i=arr.length-1;i>-1;i--) {
            if (arr[i] >= highest ) {
                System.out.println("Leader is : "+arr[i]);
                if (arr[i] > highest) {
                    highest = arr[i];;
                }
            } else {
                if (arr[i] > highest) {
                    highest = arr[i];;
                }
            }
        }
    }
}
