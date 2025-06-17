//Remove duplicates from the sorted array

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int[] arr = {23,12,23,33,22,12,44,33,78,6,33,97,5};
        
        int[] nonRepArr = new int[arr.length];
        int count = 0;
        int indexNonRep = 0;
        
        for(int i=0;i<arr.length;i++) {
            count = 0;
            for(int j=0;j<arr.length;j++) {
                if (arr[i]==arr[j] && i!=j) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                nonRepArr[indexNonRep] = arr[i];
                indexNonRep++;
            }
        }
        
        for(int index=0;index<indexNonRep;index++){
            System.out.println("->>>:"+nonRepArr[index]);
            
        }
        
    }
}
