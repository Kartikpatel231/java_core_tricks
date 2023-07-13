package JavaQustions;

public class ReverseWord {
    ReverseWord(String st) {
        System.out.println("Original string = " + st);
        //to revers a word split a string and trim
        String str[] = st.trim().split(" ");
        //take a string variable to store output
        String revers = "";
        for (int i = str.length - 1; i >= 0; i--) {
            // Append the current word and a space to the output
            revers += str[i] + " ";
        }
        String result = revers;
        System.out.println(result);
    }

    public void Rotation(String str1, String str2) {
        if (isRoted(str1, str2)) {
            System.out.println("Rotation of string is present");
        } else {
            System.out.println("Rotation of string is not present");
        }
    }

    public boolean isRoted(String str, String str2) {
        return (str.length() == str2.length() && (str + str2).indexOf(str2) != -1);
    }
    public void specialCharacter(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(! Character.isDigit(str.charAt(i)) &&! Character.isLetter((str.charAt(i)))
                            &&! Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        if(count==0){
            System.out.println("No Special Character is Found");
        }
        else {
            System.out.println("Special Character is Found"+count);
        }

    }

    public static void main(String[] args) {
        ReverseWord obj = new ReverseWord(" Java Core Tricks");
        obj.Rotation("abcd", "cdab");
        obj.specialCharacter("CloudTech#@!");
    }
}
