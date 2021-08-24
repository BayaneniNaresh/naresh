import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toUpperCase();
   }
}
public class collections_6 {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("Naresh");
      list.add("Darshith");
      list.add("Tharu");
      list.add("Gireesa");
      list.add("Rushi");
      System.out.println("Contents of the list: "+list);
      list.replaceAll(new Op());
      System.out.println("\nContents of the list after replace operation: \n"+list);
   }}