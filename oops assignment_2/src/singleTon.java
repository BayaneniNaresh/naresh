import java.util.*;
public class singleTon
{
	static singleTon obj = new singleTon();
	protected singleTon() 
	{
		
	}
	public static singleTon getobj()
	{
		return obj;
		
	}
	
}
class Innerclass extends singleTon
{
	public static void main(String[] args)
	{
	singleTon act= new singleTon();
	act.getobj();
	}
	
}
