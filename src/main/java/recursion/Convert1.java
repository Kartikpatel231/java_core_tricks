package recursion;

public class Convert1 {
    public static void main(String[] args){
        String str="5643";
        System.out.println("String str = "+str);
        //convert using for loop

        int result=0; //store result
        for (int i=0;i<str.length();i++){  //run until i not less length
            int digit=str.charAt(i)-'0';   //charAt is store one character
            result = result * 10 + digit;  //multiply by 10 because to put
                                 //element in same place and add each charAt
            }
        System.out.println("Convert in interger = "+result);
    }
}
