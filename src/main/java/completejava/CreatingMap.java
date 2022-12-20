package completejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CreatingMap {
	
	public void createhashmap() {
		Map <String,Integer >values=new HashMap<String,Integer>();
		values.put("Hari",33);
values.put("Abinaya", 28);
values.put("Adhvik", 2);
values.put("Babyamma",4); 
for(String name: values.keySet()) {
	System.out.print("name "+name);
	System.out.println();
}
for(int i: values.values()) {
	System.out.print("age"+i);
	System.out.println();
}
for(Map.Entry<String, Integer> entry:values.entrySet()) {
	System.out.println();
	System.out.print(entry.getKey()+" "+entry.getValue());
	System.out.println();
}

}
public static void creatingtreemap() {
	Map<String,String> values=new TreeMap<String,String>();
	values.put("hari", "a");
	values.put("abinaya", "b");
	values.put("adhvik", "c");
	for(Map.Entry<String, String> entry:values.entrySet()) {
		System.out.print(entry.getKey()+" "+entry.getValue());
	System.out.println();
}
}


	
	
}
