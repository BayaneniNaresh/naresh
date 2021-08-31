package Spring.Assignment1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new
                ClassPathXmlApplicationContext( "CustomerAddress.xml" );
		Customer c=(Customer)ctx.getBean("Customer");
		c.CustomerInfo();
	}

}
