package JavaQustions;

public class StringDemo {
    //Java Program to demonstrate the use of StringBuffer class.
        public static void main(String[] args){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Java");
            stringBuilder.append(" tricks");

            String result = stringBuilder.toString();
            System.out.println(result);
            stringBuilder.insert(5, " Awesome ");
            System.out.println(stringBuilder.toString());

            stringBuilder.replace(6, 13, "java_Core_tricks");
            System.out.println(stringBuilder.toString());

            stringBuilder.reverse();
            System.out.println(stringBuilder.toString());

            StringBuffer stringBuffer1 = new StringBuffer("tricks");
            if(stringBuilder.toString().equals(stringBuffer1.toString()))
                System.out.println("Both Are Equal");
            else
                System.out.println("Both Are Different");
            }
  }



//            //append() in string
//            buffer.append("java");
//            System.out.println(buffer);
//            //find length
//            int len=buffer.length();
//            //find capacity();
//            int cap=buffer.capacity();
//            //insert
//            buffer.insert(1,"_core");
//            //print result
//            System.out.println("size = "+len+"\n"+"capacity = "+cap);
//            System.out.println("insert = "+buffer);
//            //reverse()
//            StringBuffer rev=buffer.reverse();
//            System.out.println("reverse = "+rev);
//            //delete()
//            System.out.println("delete 1 to 10 = "+buffer.delete(1,10));