package recursion;

public class StairCase {
    public static int findStair(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return findStair(n-1)+findStair(n-2)+findStair(n-3);
    }
    public static void main(String[] args){
        int n=4;
        int ans=findStair(n);
        System.out.println("Total steps = "+ans);
    }
}
