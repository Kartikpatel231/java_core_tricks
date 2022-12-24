package recursion;

public class CalculatePower{
    public static int Power(int x,int n){
        if(n==0 && x==0){ //base value
            return 1;
        }
        if( x==0 ){      //base value
            return 0;
        }
        if(n==0){       //base value
            return 1;
        }
        int smallAns=Power(x,n/2); //recursion
        if(n%2==0){
         return smallAns*smallAns;
         }
         else {
            return x*smallAns*smallAns;
        }

    }
    public static void main(String[] args){
        int x=2;
        int n=5;
        int answer=Power(x,n);
        System.out.println(x+" the power "+n+ " answer ="+answer);
    }
}
