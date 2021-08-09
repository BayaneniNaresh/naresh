import java.util.Scanner;
public class Arth_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			if(n2==0)
				throw new UnsupportedOperationException("UnsupportedOperationException");
			else {
			int result=n1/n2;
			System.out.println("reslut is:"+result);
			}
		}
		catch(UnsupportedOperationException e) {
			System.out.print(e);
		}
	}

}
