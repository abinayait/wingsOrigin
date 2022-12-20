package completejava;

import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	int rollno;
	int marks;
	
	Student(String name, int rollno, int marks){
	
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return " name= "+name + " rollno= "+ rollno+  " marks= "+ marks;
	}
	
	
}