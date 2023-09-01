package tcs;

import java.util.Scanner;

public class Coding1 {
    public static void main(String[] args){
        int interCost=18;
        int exteriorCorst=12;
        Scanner sc=new Scanner(System.in);
        int intererWall=6,exteriorWall=3;
        if(intererWall<0 && exteriorWall>0){
            System.out.println("No wall to paint 0 rs");
        }
        float interSum=0;
        float total=0;
        System.out.println("enter interWall");
        for(int i=0;i<intererWall;i++){
            float a=sc.nextFloat();
            interSum =a*interCost;
            total +=interSum;
        }
        System.out.println("enter exteriorWall");
        for (int j=0;j<exteriorWall;j++){
            float b=sc.nextFloat();
            interSum =b*exteriorCorst;
            total +=interSum;
        }
        System.out.println(total);
    }

}
