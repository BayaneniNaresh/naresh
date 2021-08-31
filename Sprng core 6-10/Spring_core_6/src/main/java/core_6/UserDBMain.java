package core_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDBMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Core_6.xml");
		UserDB user=context.getBean("UserDB", UserDB.class);
		System.out.println(user.toString());

	}

}