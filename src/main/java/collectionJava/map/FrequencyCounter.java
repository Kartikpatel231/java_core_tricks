package collectionJava.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args){
        Map<Integer,Integer> obj=new HashMap<>();
        int arr[]={1,2,2,1,4,5,6,7,8};
        for(int num:arr){
            obj.put(num,obj.getOrDefault(num,0)+1);
        }
        System.out.println("count number of frequency");
        System.out.println(obj);
    }
}
