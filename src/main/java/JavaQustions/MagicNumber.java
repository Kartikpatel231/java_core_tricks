package JavaQustions;

public class MagicNumber {
    public static void main(String[] args){
        int num=163;
        System.out.println("is this magic number = "+num);
        int sumOfDigits=0;
        while (num>0 || sumOfDigits > 9){
            if(num==0){
                num=sumOfDigits;
                sumOfDigits=0;
            }
            sumOfDigits +=num%10;
            num=num/10;

        }
        //if sum is 1, original number is magic number
        if(sumOfDigits==1){
            System.out.print("Magic number");
        }
        else {
            System.out.println("Not a Magic number");
        }
    }
}
