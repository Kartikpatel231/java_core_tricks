package recursion;

public class SubString {
    public static void subString(String input,String output) {
        if (input.length()==0) { // base case
            System.out.println(output);
            return;
        }
        subString(input.substring(1),output);//exclude
        //include
        subString(input.substring(1),output+input.charAt(0));
    }

    public static void main(String[] args) {
        String str = "abc";
        String output="";
        System.out.println("Substring of string");
        subString(str,output);
    }
}
