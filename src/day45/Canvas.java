package day45;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1=new Course();
		
		course1.setName("Java programming");
		ArrayList<String> javaTeachers=new ArrayList<>();
		javaTeachers.add("Murodil");
		javaTeachers.add("Nadir");
		javaTeachers.add("Vasyl");
		
		
		course1.setTeachers(javaTeachers);
		System.out.println(course1.toString());
		
		ArrayList<String> javaStudents=new ArrayList<>();
		javaStudents.add("Anna");
		javaStudents.add("Alina");
		javaStudents.add("Elena");
		course1.setStudents(javaStudents);
		System.out.println(course1.toString());
		course1.addTeacher("Maria");
		course1.addStudent("Sung");
		//System.out.println(course1.toString());
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		if(course1.getStudents().contains("Anna")) {
			System.out.println("Yes, Anna is a student");
		}else {
			System.out.println("No, ANNA is not a student");
		}
		
		//Removing teacher and student
		course1.removeTeacher("Murodil");
		course1.removeStudent("Alina");
		
		if(!course1.getTeachers().contains("Murodil")) {
			System.out.println("Murodil is removed");
		}else {
			System.out.println("Murodil is still there");
		}
		if(!course1.getStudents().contains("Alina")) {
			System.out.println("Alina is removed");
		}else {
			System.out.println("No, Alina is still there");
		}
	}

}
