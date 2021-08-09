import java.util.*;
public class Arth_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int result=n1/n2;
			System.out.println("reslut is:"+result);
		}
		catch(ArithmeticException e) {
			System.out.print("can't devide number by 0");
		}
	}

}
