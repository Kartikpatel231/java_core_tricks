package JavaQustions;

public class Palindrom {
    public static boolean isPalindrome(int n){
            if(n<0 || (n%10==0 && n!=0)){
            return false;
        }
        int reversSum=0;
            while (n>reversSum){
                int pop=n%10;
                reversSum=reversSum*10+pop;
                n=n/10;
                }
                return (n==reversSum) || (n==reversSum/10);
    }

    public static void main(String[] args){
        int n=121;
        System.out.println("check number is palindrome or not = "+n);
        boolean ans=isPalindrome(n);
        System.out.println(ans);
    }
}
