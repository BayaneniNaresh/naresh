import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
public class Ann_1{
	@Test
	public static void myMethod() {
		System.out.println("Annotion applied on method.");
	}
	public static void main(String args[]) {
		myMethod();
		
	}
}