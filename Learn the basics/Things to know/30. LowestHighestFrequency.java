class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = {1,2,5,8,8,3,9,3,8,1};
        int[] hashedArr = new int[10];
        int lowestNum = -1;
        int lowestCount = -1;
        int highestNum = 0;
        int highestCount = 0;
        for (int i=0; i<arr.length; i++) {
            hashedArr[arr[i]]++;
        }
        for (int j=1; j<hashedArr.length; j++) {
            
            if (lowestCount>hashedArr[arr[j]]||lowestCount==-1) {
                lowestCount = hashedArr[arr[j]];
                lowestNum = arr[j];
            }
            if (highestCount<hashedArr[arr[j]]) {
                highestCount = hashedArr[arr[j]];
                highestNum = arr[j];
            }
        }
        System.out.println("lowestCount : "+lowestCount+", lowestNum : "+lowestNum+"\nhighestCount : "+highestCount+", highestNum : "+highestNum);
        
        
    }
}
