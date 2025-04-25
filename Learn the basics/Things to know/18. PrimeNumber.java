// Check if a number is prime

class Main {
    public static void main(String[] args) {
        int primeNumber = 32;
        
        for (int i=2; i<Math.sqrt(primeNumber); i++) {
            if (primeNumber%i == 0) {
                System.out.println("prime no:"+i);
                break;
            }
        }
        
    }
}
