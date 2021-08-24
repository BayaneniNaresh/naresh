import java.util.ArrayList;
import java.util.List;

public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Naresh");
		l.add("Tharu");
		l.add("Gireesa");
		l.add("sai");
		l.add("vijayC");
		System.out.println("Original list is: "+l+"\n");
		l.removeIf(s -> (s.length() % 2 != 0));
		  System.out.println("List After oddlenth Strings are removed is:  "+l);
        
	}
}
