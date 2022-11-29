package string;
public class BasicString {
    public static void main(String[] args) {
        System.out.println("Print The SubString  ");
        String str = "Java";
        mySubString(str);

    }
    public static void mySubString(String str) {

        for (int start = 0; start < str.length(); start++) {
            //We will be printing all substrings starting with char at index start
            for (int end = start; end < str.length(); end++) {
                System.out.println(str.substring(start, end + 1));
            }
        }
    }
}

