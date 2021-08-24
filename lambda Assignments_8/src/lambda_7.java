import java.util.HashMap;
import java.util.Map;

public class Collection_7 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(200,"Bayaneni");
		map.put(201,"Naresh");
		map.put(202,"Chowdary");
		
		System.out.println(map);
		
		StringBuilder SB=new StringBuilder("");
		for(Map.Entry m:map.entrySet()) {
			SB.append(m.getKey());
			SB.append(m.getValue());
		}
		System.out.println(SB);
	}
}