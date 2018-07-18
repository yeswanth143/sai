import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Demo1{
  public static void  main(String args[]){
       Pattern compile=Pattern.compile("[a-zA-Z0-9]*@gmail[.][a-zA-Z]*");
       Matcher matcher=compile.matcher("manikanta@gmail.com");
       while(matcher.find())
        {
         System.out.println(matcher.group());
        }
      }
}
