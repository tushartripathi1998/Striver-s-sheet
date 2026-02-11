class FindNthFibonacci {
    public static void main(String[] args) {
        System.out.println(getFibonacci(7));
    }
    public static Integer getFibonacci(int n) {
        if (n==0 || n==1) {
            return n;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
}
