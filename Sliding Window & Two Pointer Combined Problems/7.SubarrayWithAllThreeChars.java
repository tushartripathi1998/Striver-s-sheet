// Number of substring containing all three characters

class Main {
    public static void main(String[] args) {
        Boolean flagA = false;
        Boolean flagB = false;
        Boolean flagC = false;
        
        String s = "abcabc";
        for (int i=0;i<s.length();i++) {
            flagA = false;
            flagB = false;
            flagC = false;
            for (int j=i;j<s.length();j++) {
                if (s.charAt(j) == 'a') {
                    flagA = true;
                }
                if (s.charAt(j) == 'b') {
                    flagB = true;
                }
                if (s.charAt(j) == 'c') {
                    flagC = true;
                }
                if (flagA == true && flagB == true && flagC==true) {
                    System.out.println("Pairs are : "+i+"-"+j);
                }
            }
        }
    }
}
