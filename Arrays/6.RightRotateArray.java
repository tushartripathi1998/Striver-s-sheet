//  rotate array by n places right

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int shift = 2;
        int[] transformedArr = new int[arr.length];
        int newIndex = 0;
        
        shift = shift%arr.length;
        
        for(int i=0;i<arr.length;i++) {
            newIndex = i+shift;
            if(newIndex>=arr.length){
                newIndex = newIndex-arr.length;
            }
            transformedArr[newIndex] = arr[i];
        }
        
        for (int j=0;j<transformedArr.length;j++) {
            System.out.println(transformedArr[j]);
        }
    }
}
