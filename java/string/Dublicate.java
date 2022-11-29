package string;

public class Dublicate {
    public static String checkDublicate(String str) { //function with argument
        int count = 0;                                //count varable
        String answer = "";                           //empty string
        for (int i = 0; i < str.length(); i++) {      //iterate for loop
            char ascii = str.charAt(i);               //convert string to char
            int value = ascii;                        //typecasting char into int
            if (count != value) {                     //check conditions

                answer += ascii;                      //fill string
            } else {
                continue;                             //continue statement
            }
            count = value;                            //assign value
        }
        return answer;                                //return
    }
    public static void main(String[] args) {
        String str = "aabbca";                         //main string
        System.out.println("original string := "+str);
        String ans = checkDublicate(str);              //function call
        System.out.println("After remove consecutive elements := "+ans);  //print
    }
}
