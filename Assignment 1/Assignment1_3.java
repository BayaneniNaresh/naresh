import java.util.*;
public class SimpleCompound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double p, r, t, a, si, ci;
		System.out.println("Enter Principle amount=");
		p=sc.nextDouble();
		System.out.println("Enter Rate of intrest=");
		r=sc.nextDouble();
		System.out.println("Enter Time in years=");
		t=sc.nextDouble();
			
		si=(p*r*t)/100;
			
		System.out.println("Simple Interest="+si);
		a = p*Math.pow((1 + r / 100), t);
		ci =  a - p;
		System.out.println("Compound Interest="+ci);	
	}

}
