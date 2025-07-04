// Single Among Doubles

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {2, 2, 5, 5, 20, 20, 30};
        int i=0;
        while(i<arr.length) {
            if (i+1<arr.length && arr[i]==arr[i+1]) {
                i=i+2;
                continue;
            } else {
                System.out.println("i is: "+i);
                break;
            }
        }
    }
}
