package collectionJava.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArray {
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={21,2};
        Map<Integer,Integer> obj=new HashMap<>();
        System.out.println("Intersection b/w two Array");
        for(int num:nums1){
            obj.put(num,obj.getOrDefault(num,0)+1);
        }
        List<Integer> intersection=new ArrayList<>();
        for(int num:nums2){
          if(obj.containsKey(num) && obj.get(num)>0){
              intersection.add(num);
              obj.put(num,obj.get(num)-1);
          }

        }
        System.out.println(intersection);
    }
}
