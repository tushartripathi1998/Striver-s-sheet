// Find element in linear search

class Main {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,8,9};
        int k=2;
        int runningIndex=0;
        int i=0;
        int temp=-1;
        if (arr[arr.length-1]>=k && arr[0]<=k) {
            while(i<arr.length) {
                    if (arr[i]==k) {
                        temp = i;
                        break;
                    }
                i++;
            }
        }
        if (temp!=-1) {
            System.out.println("Element found at index : "+temp);
        } else {
            System.out.println("Element not found");
        }
    }
}
