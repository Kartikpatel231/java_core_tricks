package string;

public class Buffer {
    public static String mutableExample(){
        StringBuffer obj  =new StringBuffer("JAVA ");   //creating StringBuffer object
        obj.setCharAt(4,'_');             //set character to existing String
        obj.append("Core ");                        //append String to existing String
        obj.setCharAt(9,'_');
        obj.append("Tricks");
        return String.valueOf(obj);           //converting obj into String
    }
    public static void main(String[] args){
        String ans=mutableExample();
        System.out.println("String Buffer is mutable so we can add or delete elements");
        System.out.println(ans);
    }
}
