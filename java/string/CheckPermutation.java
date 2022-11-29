package string;
public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "abcde";      //fist string
        String str2 = "bedca";      //second string
        boolean ans = CheckPermutation(str1, str2);  //constructor(with arguments1,arguments2)
        System.out.println(ans);                 //print(ans)
    }
    static boolean CheckPermutation(String str1, String str2) {  //static constructor no need to make object
        int frequency[] = new int[256];                   //initialize array to check ascii value
        if (str1.length() != str2.length())            //compare two string length
            return false;
        for (int i = 0; i < str1.length(); i++) {       //iterate first string and convert  to ascii
            char ascii = str1.charAt(i);           //convert string into character
            int value = ascii;                    //conversion
            frequency[value] = frequency[value] + 1;   //fill empty array wtih ascii value and fill 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            char ascii = str2.charAt(i);
            int value = ascii;
            frequency[value] = frequency[value] - 1;
        }
        for (int elements : frequency) {                 //check arrayFrequency
            if (elements != 0)
                return false;
        }
        return true;
    }}
