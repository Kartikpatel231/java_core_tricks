package LambdaExpression;

public class UniqueElement{
    public static int uniqueNumber(int arr[]){
        int answer=0;
        for(int i=0;i<arr.length;i++){
        answer=answer ^ arr[i]; //^ this symbol denote xor in java
        }
        return answer;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,1,2,3,4};
        int result=uniqueNumber(arr);
        System.out.println("Unique elements is = "+result);
    }

}
