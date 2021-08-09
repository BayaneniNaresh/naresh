import java.util.*;
public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String userName="Naresh";
		String password="Naresh123";
		String uname,pssd;
		int i=1;
		while(i>0)
		{
			System.out.println("Enter the user name:");
			uname=sc.next();
			System.out.println("Enter the Password:");
			pssd=sc.next();
			if(userName.equals(uname) && password.equals(pssd))
			{
				System.out.println("Welcome "+uname);
				break;
			}
			else 
			{
				System.out.println("Username and Password are wrong!,Re-enter the Details.");
				i++;
			}
			if(i>3)
			{
				System.out.println("Contact Admin.");
				break;
			}
			
		}
	}

}
