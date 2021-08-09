import java.util.*;
public class AM1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num,rem;
		for(int i=100;i<=999;i++) 
		{
			int sum=0;
			num=i;
			while(num>0) 
			{
				rem=num%10;
				num=num/10;
				sum=sum+(rem*rem*rem);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}

}

