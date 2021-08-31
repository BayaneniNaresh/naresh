package collections_2.Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new
                ClassPathXmlApplicationContext( "Collection_2.xml" );
		Question c=(Question)ctx.getBean("Question");
		c.displayList();
		c.displaySet();
		c.displayMap();
	}

}
