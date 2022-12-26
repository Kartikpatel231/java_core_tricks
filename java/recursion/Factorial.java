package recursion;


public class Factorial {
  public static int findFactorial(int n){
        if(n==0){     //BaseCase
            return 1;
        }
        else {       //calculation repeating function again
            return n*findFactorial(n-1);
        }
    }
    public static void main(String[] args){
       int n=5;
       int answer=findFactorial(n);
       System.out.println("Factorial of "+n+" = "+answer);
    }
}
