package predicate;


import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		String[] values = { "Arpit", "Amit", "Tom", "Ellie", "Deepak", "Nagma", "Rahul" };
		Predicate<String> p1 = str -> str.length() > 5;

		for (String value : values) {
			if (p1.test(value))
				System.out.println(value);
		}
	}
}