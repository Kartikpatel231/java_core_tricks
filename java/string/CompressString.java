package string;
public class CompressString{
    public static void main(String[] args){
        String str="aaabbbccccdddddeeeeeefffffffgggggggLOVE";
        System.out.println("Before Compress = "+str);
        String answer=CompressString(str);
        System.out.println("After compress = "+answer);
        }
    public static String CompressString(String str){
        String ans="";
        char compare = 0;
        int count=1;
        for(int i=0;i<str.length();i++){
            char ascii=str.charAt(i);
            if(ascii == compare){
                ++count;
            }
            else{
                if(count>1){
                    ans=ans+count;
                    count=1;
                }ans=ans+ascii;
            }compare=ascii;
        }
        if(count>1){
            ans=ans+count;
        }
        return ans; }}
