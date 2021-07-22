import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
   private static final String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

   public static void main(String args[]) {
       //adding  emails to an array list
       List<String> emails = new ArrayList<>();
       //alamat email valid
       emails.add("ikhsan@example.co.id");
       emails.add("ikhsan.mutaqin@example.id");
      
       //alamat email tidak valid
       emails.add("ikhsan.example.com");
       emails.add("ikhsan..mutaqin@example.com");
       emails.add("ikhsan@example.me.org");

       //inisialisasi objek Pola
       Pattern pattern = Pattern.compile(regex);

       //mencari kemunculan regex
       emails.forEach((value) -> {
           Matcher matcher = pattern.matcher(value);

           System.out.println("Email " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
       });
   }
}
