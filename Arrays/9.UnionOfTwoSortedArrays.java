// Union of 2 sorted arrays with duplicate elements

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        int startIndex = 0;
        int endIndex = 0;
        int[] mergedArr = new int[a.length+b.length];
        int mergedIndex = 0;
        
        while (startIndex<a.length && endIndex<b.length) {
            if (mergedIndex>0 && (mergedArr[mergedIndex-1]==a[startIndex] || 
                mergedArr[mergedIndex-1]==b[endIndex])) {
                    if (mergedArr[mergedIndex-1]==a[startIndex]) {
                        startIndex++;
                    } else {
                        System.out.println("data "+mergedIndex);
                        endIndex++;
                    }
                continue;
            }
            
            if (a[startIndex]<b[endIndex]) {
                mergedArr[mergedIndex] = a[startIndex];
                startIndex++;
                mergedIndex++;
            } else {
                mergedArr[mergedIndex] = b[endIndex];
                endIndex++;
                mergedIndex++;
            }
        }
        
        for (int i=startIndex;i<a.length;i++) {
            mergedArr[mergedIndex] = a[i];
            mergedIndex++;
        }
        
        for (int j=endIndex;j<b.length;j++) {
            System.out.println("::"+b[j]);
            mergedArr[mergedIndex] = b[j];
            mergedIndex++;
        }
    }
}
