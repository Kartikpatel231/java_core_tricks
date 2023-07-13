package JavaQustions;

public class StringFunction {
    public static void main(String[] args){
        String str="Hello Java_Core_Tricks";
        //make lower case
        System.out.println("1)"+str.toLowerCase());
        //make upper case
        System.out.println("2)"+str.toUpperCase());
        //print only first letter capital
        String st=str.substring(0,1).toUpperCase()+str.toLowerCase();
        System.out.println("3)"+st);
        //print subString
        System.out.println("4)"+str.substring(1,5));
        //check letter start with
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("5)"+startsWithHello);
    }
}
