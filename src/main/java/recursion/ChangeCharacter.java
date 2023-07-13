package recursion;

import java.util.Arrays;

public class ChangeCharacter {
    public static String replace(Character[] str,int size,char rep,char put){
        if(size==0){
            return " ";
        }
        if(str[size-1]==rep){
            str[size-1]=put;

        }
        return replace(str,size-1,rep,put)+str[size - 1];

    }
    public static void main(String[] args){
        Character[] str={'I','N','S','T','A','G','R','A','M'};
        System.out.println(Arrays.toString(str));
        int size=str.length;
        char rep='A';
        String ans=replace(str,size,rep,'M');
        System.out.println("after replace  Character  With M "+ans);
    }
}
