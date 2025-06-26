// Missing number in array of length 'n'

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {3,0,1,2,5};
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                if (arr[j] == i) {
                    break;
                } else {
                    if (j==arr.length-1) {
                        System.out.println("Missing num is : "+i);
                    }
                }
            }
        }
    }
}
