package string;
public class ReverseEachWord {
    public static String reverseWord(String str, int start, int end) {
        String reveranswer = "";
        while (start < end) {
            reveranswer = str.charAt(start) + reveranswer;
            ++start;
        }
        return reveranswer; }
        public static String reverseEachWord(String str) {
        int previousSpaceIndex = -1;
        String ans = "";
        int i=0;
        for ( ; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                ans += (reverseWord(str, previousSpaceIndex + 1, i) + " ");
                previousSpaceIndex = i; }
        }
        ans += (reverseWord(str, previousSpaceIndex + 1,i)+ " ");
        return ans;
    }
    public static void main(String[] args) {
        String str = "Hello, I Love Java";
        System.out.println(str);
        String ans = reverseEachWord(str);
        System.out.println(ans);
    }}


