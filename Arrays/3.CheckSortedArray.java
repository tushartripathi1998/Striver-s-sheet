//check if array is sorted
class Main {
    public static void main(String[] args) {
        int[] arr = {12,32,45,62,62,78,82,90};
        Boolean flag = true;
        for (int i=1;i<arr.length;i++){
            if (arr[i-1]>arr[i]) {
                flag = false;
            }
        }
        System.out.println("Second largest number is : "+flag);
    }
}
