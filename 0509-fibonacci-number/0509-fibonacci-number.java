class Solution {
    public int fib(int n) {
        int[] f = new int[n+1];
        return fibonacii(n,f);
    }
    public int fibonacii(int n,int f[]){
        if(n == 0 || n==1){
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }
        
        f[n] = fibonacii(n-1,f) + fibonacii(n-2,f);
        return f[n];
    }
}