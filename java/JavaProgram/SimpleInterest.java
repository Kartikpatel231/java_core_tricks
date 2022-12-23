package JavaProgram;

import java.util.Scanner;

public class SimpleInterest{
    private double principle;
    private double rate;

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(float time) {
        this.time = time;
    }

    private float time;
    private double answer;

    public double getPrinciple() {
        return principle;
    }

    public double getRate() {
        return rate;
    }

    public float getTime() {
        return time;
    }

    private SimpleInterest() {
        this.principle = principle;
        this.rate = rate;
        this.time = time;
        double answer=(principle*rate*time)/100;
        System.out.println("Simple Interest = "+answer);

    }
    private double myInterest(){
        answer=(getPrinciple()*getRate()*getTime()/1000);
        return answer;
    }

    public static void main(String[] args){
        SimpleInterest obj=new SimpleInterest();
        Scanner sc=new Scanner(System.in);
    System.out.println("enter amount of money");
        Double p=sc.nextDouble();
        System.out.println("enter interest rate for amount");
        Double r=sc.nextDouble();
        System.out.println("enter time for return");
        Float t=sc.nextFloat();
        SimpleInterest obj1=new SimpleInterest();
        obj.setPrinciple(p);
        obj1.setRate(r);
        obj1.setTime(t);
    }
}
