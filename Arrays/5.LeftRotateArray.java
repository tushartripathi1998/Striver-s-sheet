// Left rotate array by n places

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int shift = 40;
        int[] transformedArr = new int[arr.length];
        int newIndex = 0;
        
        shift = shift%arr.length;
        
        for(int i=0;i<arr.length;i++) {
            newIndex = i-shift;
            if(newIndex<0){
                newIndex = arr.length+newIndex;
            }
            transformedArr[newIndex] = arr[i];
        }
    }
}
