package recursion;

public class CountNumber{

    static int CountNumber(int n){
        if(n==0){
            return 0;
            }
        int small=CountNumber(n/10);
        return small+1;

    }
    public static void main(String[] args){
       int answer= CountNumber(456);
       System.out.println("length of number is = "+answer);
    }
}
