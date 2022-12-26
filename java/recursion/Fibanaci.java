package recursion;

public class Fibanaci{
    static int FibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        return FibonacciNumber(n-1)+FibonacciNumber(n-2);
    }
    public static void main(String[] args){
        int answer=FibonacciNumber(10);
        System.out.println(answer);
    }
}
