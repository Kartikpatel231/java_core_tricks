package string;
import static java.lang.Math.max;
public class CountFrequency{
    public static void main(String[] args){
        String str="babbcccccccfaga";
        Character answer=countFrquency(str);
        System.out.println("MaximumFrequcyofCharater = "+answer);
    }
    public static Character countFrquency(String str){
        int frequency[]=new int[256];
        int maximumFrequncy=0;
        char mychar='-';
        for (int i=0;i<str.length();i++) {
            char answer=str.charAt(i);
            int value=answer;
        frequency[value]=frequency[value]+1;
        maximumFrequncy=max(maximumFrequncy,frequency[value]);
        }
        for(int i=0;i<str.length();i++){
            char answer=str.charAt(i);
            int value=answer;
            if(frequency[value] == maximumFrequncy){
               mychar=answer;
              break; }
        }return mychar;
    }}
