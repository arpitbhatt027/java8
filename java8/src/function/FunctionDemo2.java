package function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	Integer marks;

	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class FunctionDemo2 {

	public static void main(String[] args) {
		Function<Student, String> studentFunction = studentObject -> {
			Integer marks = studentObject.marks;
			return (marks >= 80) ? "A" : (marks >= 60) ? "B" : (marks >= 50) ? "C" : (marks >= 40) ? "D" : "F";
		};

		Predicate<Student> checkStudentPass = student -> student.marks >= 60;

		Student[] students = { new Student("Durga", 15), new Student("Arpit", 70), new Student("Amit", 65),
				new Student("Ajay", 35), new Student("Alok", 85) };

		for (Student student : students) {
			if (checkStudentPass.test(student))
				System.out.println(student.name + "  " + student.marks + "  " + studentFunction.apply(student));
		}
	}
}
