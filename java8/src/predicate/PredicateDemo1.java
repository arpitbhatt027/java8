package predicate;


import java.util.function.Predicate;

class Developer {
	Integer salary;
	Integer age;

	public Developer(Integer salary, Integer age) {
		this.salary = salary;
		this.age = age;
	}
}

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(11));

		Developer d1 = new Developer(10000, 25);
		Predicate<Developer> p2 = d -> d.salary > 8000 && d.age > 20 == true;
		System.out.println(p2.test(d1));
	}

}
