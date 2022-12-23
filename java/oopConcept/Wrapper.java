package oopConcept;
//Java Program to convert primitive into Object
public class Wrapper{
    public static void main(String[] args){
        int a=20;
        Integer i=Integer.valueOf(a)+2;//converting char into integer
        Integer j=a+3;
        System.out.println(a+""+i+"-"+j);

    }
}
