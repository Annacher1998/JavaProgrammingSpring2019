package day45;
import java.util.*;
public class Course {

	private String name;
	private List<String> teachers=new ArrayList<>();
	private List<String> students=new ArrayList<>();
	
	
	@Override
	// toString method
	public String toString() {
		return "Course [name=" + name + ", teachers=" + teachers + ", students=" + students + "]";
	}
	//Methods
	public void addStudent(String studentName) {
		students.add(studentName);
		
	}
	public void addTeacher(String teacherName) {
		teachers.add(teacherName);
		
	}
	
	public void removeStudent(String studentName) {
		students.remove(studentName);
		
	}
	public void removeTeacher(String teacherName) {
		teachers.remove(teacherName);
		
	}
	////////////Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	
	
}
