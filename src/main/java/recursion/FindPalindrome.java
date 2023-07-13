package recursion;
public class FindPalindrome{
    public static boolean FindPalindrome(int[] arr,int start,int end){
        if(start>end){
            //empty array is palindrome
            return true;
        }
        if(arr[start]==arr[end]){
            //condition true start and last element same 1......1
            //repeat function until base condition or else condition become false
            return  FindPalindrome(arr,start+1,end-1);

        }
        else {
            //condition not match 1.......3
            return false;
        }
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,3,2,1};
        int start=0;
        int end=arr.length;
        boolean ans=FindPalindrome(arr,start,end-1);
                if(ans){
                    System.out.println("Array is palindrome = " +ans);
                }
                else {
                    System.out.println("Array is not palindrome" + ans);
                }
    }
}
