package LambdaExpression;

import java.util.ArrayList;

class Programming{
String progLanguage1="java";
String progLanguage2="python";
String progLanguage3="c++";
public void ProgrammingLanguages(){
        ArrayList<String> language = new ArrayList<>();
        language.add(progLanguage1);
        language.add(progLanguage2);
        language.add(progLanguage3);
        System.out.println(language);
    }
}
public class LambdaExpressionExample {
    public static void main(String[] args) {
    Programming obj=new Programming();
    obj.ProgrammingLanguages();
    }
}

