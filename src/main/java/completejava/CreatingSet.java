package completejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CreatingSet {

	public static void creatingHashSet() {
		Set<Integer> values=new HashSet<Integer>();
		values.add(2);
		values.add(5);
		values.add(7);
		values.add(1);
		values.add(2);
		System.out.println();
		System.out.print(values+" ");
	System.out.println();
	for(int i:values) {
		System.out.print(i+" ");
		
	}
	Iterator itr=values.iterator();
	while(itr.hasNext()) {
		System.out.println();
		System.out.print(itr.next()+" ");
	}
	}
}

