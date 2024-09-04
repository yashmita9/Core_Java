package In.com.Comparable;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	
	int rollno ;
	String name;
	int age;
	
	public Student(int rollno , String name , int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println();
		return rollno + " " + name + " " +age + " ";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
