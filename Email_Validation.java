package evalidation;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
   public static void main(String args[]) {
    List<String> emails = new ArrayList<String>();
      emails.add("snadeen.shakeeb@mphasis.com");
      emails.add("snadeemshakeeb@gmail.com");
      emails.add("snadeem_shakeeb%google-india.com");
      emails.add("snadeem.shakeeb@gmail-indai.com");
      emails.add("shakeeb#@youtube.co.in");
      emails.add("naddy@domaincom");
      emails.add("naddy#gmail.com");
      emails.add("@nadeem.com");
      
      String regex = "^(.+)@(.+)$";
      Pattern pattern = Pattern.compile(regex);
      
      for (Object email : emails) {
         Matcher matcher = pattern.matcher((CharSequence) email);
         System.out.println(email + " : " + matcher.matches());
      } 
   }
}

