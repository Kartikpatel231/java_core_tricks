package recursion;

public class Convert {
    public static  int convert(String str){ //method
        //base case
        int size=str.length();              //size of string
        if(size==1){                        //condition
            return str.charAt(0) - '0' ;   //add 1st element of string
        }
        else {
        char lastCharacter=str.charAt(size-1);  //contain one element from last
        String subString=str.substring(0,size-1);
                                                 //decrease size each function call
        return convert(subString)*10+(lastCharacter-'0');  //convert
        }
    }
    public static void main(String[] args){
        String str="1234a";
        int str1=123;
        System.out.println("Original str    =  "+str);
        int ans=convert(str);
        System.out.println("convert into int  = "+ans);
    }
}
