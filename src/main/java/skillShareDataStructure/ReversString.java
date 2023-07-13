package skillShareDataStructure;
public class ReversString {
    public static  String rev(String str){     //1 method with for loop
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public static void rev1(String str,char[] ans1,int i){
        if(i==0){                            // 2 method with recursion
            return ;
        }
        String ans2="";
        ans2+=ans1[i-1];
        System.out.print(ans2);
        rev1(str,ans1,i-1);

    }
    public static void main(String[] args){
        String str="kartik";

        String ans=rev(str);
        System.out.println(ans);
         char ans1[]=str.toCharArray();
        rev1(str,ans1,str.length());
        }
}
