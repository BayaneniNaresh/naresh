import java.util.*;
enum Gender{
	Male,Female;
	}
class contact <T>{
	private T[] arr;
	long phoneNumber;
	String name;
	String Email;
	Object Gender;
	contact(){}
	public contact(String name, String email,Object Gender) {
		super();
		this.phoneNumber = this.phoneNumber;
		this.name = name;
		this.Gender=Gender;
		this.Email = email;
	} 
	public String toString() {
		return "["+name+", "+Email+", "+Gender+"]";
		 		
	}
}
public class Treemap_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		contact[] obj=new contact[5];
		obj[0]=new contact<Object>("Naresh","Naresh@gmail.com",M);
		obj[1]=new contact<Object>("vijay","Mahesh@gmail.com",M);
		obj[2]=new contact<Object>("laddu","Hemanth@gmail.com",M);
		obj[3]=new contact<Object>("Tharu","Tharu@gmail.com",F);
		obj[4]=new contact<Object>("Rushi","Rushi@gmail.com",F);
		TreeMap<Long,contact> t= new TreeMap<Long,contact>(Collections.reverseOrder());
		t.put((long)961857770,obj[0]);
		t.put((long)961857771,obj[1]);
		t.put((long)961857772,obj[2]);
		t.put((long)961857773,obj[3]);
		t.put((long)961857774,obj[4]);
		System.out.println("-----Keys----\n");
		for(Map.Entry m1:t.entrySet()){ 
			System.out.println(m1.getKey());
		}
		System.out.println("\n----Values----\n");
			for(Map.Entry m:t.entrySet()){ 
				System.out.println(m.getValue().toString());
			}
			System.out.println("\n-----KeyValue pairs-----\n");
		for(Map.Entry m:t.entrySet()){ 
		       System.out.println(m.getKey()+" :"+m.getValue().toString());    
		      }    
	    }
        }
