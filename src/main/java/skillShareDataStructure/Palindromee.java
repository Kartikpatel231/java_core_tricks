package skillShareDataStructure;

public class Palindromee {
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
            }
            return true;
        }

    public static void main(String[] args){
        String str="brainaniarb";
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        boolean ispalindrome=checkPalindrome(str);
        System.out.println(ispalindrome);
    }
}
