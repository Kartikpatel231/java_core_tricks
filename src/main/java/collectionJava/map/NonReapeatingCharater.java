package collectionJava.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonReapeatingCharater {
    public static void main(String[] args){
        Map<Character,Integer> obj=new LinkedHashMap<>();
        String str="Java_Core_Tricks";
        for(Character c:str.toCharArray()){
            obj.put(c,obj.getOrDefault(c,0)+1);
        }
        System.out.println("non repeating character");
        for(Map.Entry<Character,Integer> ans:obj.entrySet()){
            if(ans.getValue()==1){
                System.out.println("First non-repeated character: " + ans.getKey());
                break;
            }
        }
    }
}
