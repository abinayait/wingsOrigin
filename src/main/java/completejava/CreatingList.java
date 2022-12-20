package completejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreatingList {
	public static void creatinglist() {
		List <Student> stud=new ArrayList<Student>();
		stud.add(new Student("Adhvik",1,80));
		stud.add(new Student("Babyamma",2,80));
		System.out.print(stud);
	}
	public static String creatinganimals() {
		List<String> animalnames=new ArrayList<String>();
		animalnames.add("dog");
		animalnames.add("cat");
		animalnames.add("camel");
		animalnames.add("cow");
		animalnames.add("horse");
		for(String pet:animalnames) {
			System.out.println();
			System.out.print(pet+" ");
		}
		System.out.println("index 2 value="+animalnames.get(2));
	return animalnames.get(0);
	}
	public static void creatingbirds() {
		List<String> birds=new ArrayList<String>();
		birds.add("macow");
		birds.add("crow");
		birds.add("parrot");
		Iterator itr=birds.iterator();
		while(itr.hasNext()) {
			System.out.println();
			System.out.print(itr.next()+" ");
		}
		
	}
}
