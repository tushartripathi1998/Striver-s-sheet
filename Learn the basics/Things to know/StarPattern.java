// **********
// ****--****
// ***----***
// **------**
// *--------*
// *--------*
// **------**
// ***----***
// ****--****
// **********

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 10;
        int countBlank = 0;
        int countStar = 0;
        for (int i=0; i<n; i++) {
            if (i<5) {
                countBlank = i*2;
            } else {
                countBlank = (n-i-1)*2;
            }
            countStar = n-countBlank;
            for (int j=countStar/2; j>0;j--) {
                System.out.print("*");
            }
            while(countBlank!=0) {
                System.out.print("-");
                countBlank--;
            }
            for (int j=countStar/2; j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
