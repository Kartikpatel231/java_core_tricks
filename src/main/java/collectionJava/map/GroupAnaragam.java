package collectionJava.map;

import java.util.*;

public class GroupAnaragam {
    public static void main(String[] args){
        String words[]={"eat","tae","ate","tea","aet","ete"};
        Map<String, List<String>> group=new HashMap<>();
        for(String word:words){
            char[] charArray=word.toCharArray();
            Arrays.sort(charArray);

            String sortedWord=new String(charArray);
            group.putIfAbsent(sortedWord,new ArrayList<>());
            group.get(sortedWord).add(word);

        }
        System.out.println(group.values());

    }
}
