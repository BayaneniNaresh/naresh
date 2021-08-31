package Naresh;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,Customer> customers=new HashMap<>();
	public static Map<Long,Customer> getCustomers(){
		return customers;
	}
	

}