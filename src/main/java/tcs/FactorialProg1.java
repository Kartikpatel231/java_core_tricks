package tcs;

public class FactorialProg1 {
    public static void main(String[] args){
        int n=5;
        //square of number
        System.out.println("Square of number");
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
            }
            //factorial of number
        System.out.println("Factorial of numbers");
        int fact=1;
        for(int i=1;i<=n;i++){
            System.out.println(fact*=i);
        }
        //fibonacci Series
        System.out.println("Fibonacci Series");
        int a=0;
        int b=1;
        System.out.println("First "+n+" terms "+"\n"+a+"\n"+b);
        for(int i=2;i<=n;i++){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);
        }
        //prime Number
        System.out.println("Check Prime number "+n);
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(8);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        //Armstrong Number
        n=5;
        System.out.println("Armstrong Number "+n);
        int originalNumber=n;
        int sumOfCubes=0;
        int digit;
        while (n>0){
            digit=n%10;
            sumOfCubes+=Math.pow(digit,3);
            n=n/10;
        }
        if(sumOfCubes==originalNumber)
            System.out.println("true");
        else
            System.out.println("false");
    }


}
