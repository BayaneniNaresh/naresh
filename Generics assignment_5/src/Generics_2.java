import java.util.*;
import java.util.Map.Entry;  
class Generics_2{  
public static void main(String args[]){  
	Random rand= new Random();
	Map<Integer,Double> hs=new HashMap<Integer,Double>();  
	for(int i=0;i<10;i++) {
		int keys=rand.nextInt(100);
		double values=rand.nextDouble();
		hs.put(keys,values);
} 
Set<Entry<Integer, Double>> set=hs.entrySet();  
Iterator<Entry<Integer, Double>> itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry e=itr.next(); 
System.out.println("Key : "+e.getKey()+" value :"+e.getValue());  
}  
}
}  