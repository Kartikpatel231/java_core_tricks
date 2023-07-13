package recursion;

public class CountCharacter {
    public static int print(Character[] str,int size){
        if(size==0){
            return 0;
        }
        return 1+print(str,size-1);

    }
    public static void main(String[] args){
        Character[] str={'j','a','v','a'};
        for (Character character : str) {
            System.out.println(character);
        }
        int size=str.length;
        int count=print(str,size);
        System.out.println("number of  Character = "+count);
    }
}
