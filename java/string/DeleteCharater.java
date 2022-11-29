package string;

public class DeleteCharater{
    public static void main(String[] args){
        String str="HappyBirthday";
        char delete='a';
        String ans=DeleteCharater(str,delete);
        System.out.println(ans);
    }
    public static String DeleteCharater(String str,char delete){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != delete){
                ans =ans+str.charAt(i);
            }
        }
        return ans;
    }
}
