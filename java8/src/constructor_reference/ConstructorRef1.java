package constructor_reference;

interface Interf2 {
	public Student studentMethod();
}

class Student {
	Student() {
		System.out.println("Student Constructor");
	}

	public void info() {
		System.out.println("Student class info method");
	}
}

public class ConstructorRef1 {
	public static void main(String[] args) {
		Interf2 i1 = () -> new Student();
		i1.studentMethod().info();
		System.out.println("----------");
		Interf2 i2 = Student::new;
		i2.studentMethod().info();
	}
}