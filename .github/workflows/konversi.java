import java.util.*;
import java.text.*;
public class konversi {
  


   public static void main(String args[]) {

      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("h:m ");

      System.out.println("07:45:00 PM => " + ft.format(HariSekarang));
   }
}  

