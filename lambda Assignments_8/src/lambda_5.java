import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 
class ConsumerInterfaceExample1 {  
	static StringBuffer sb=new StringBuffer();
    static StringBuffer printMessage(String name){  
          return sb.append(name.charAt(0));
    } 
}
public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer1 = ConsumerInterfaceExample1::printMessage;  
	    List<String> l=new ArrayList<String>();
	    l.add("Naresh");
	    l.add("Amar");
	    l.add("Ramana");
	    l.add("Mahesh");
	    for(String l1:l) {
		consumer1.accept(l1);
	    }
	    System.out.print("The Output String is : ");
	    System.out.println(ConsumerInterfaceExample1.sb);
	}

}
