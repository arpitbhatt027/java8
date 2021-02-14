package predicate;


import java.util.function.Predicate;

public class PredicateMultipleDemo {

	public static void main(String[] args) {

		int[] numbers = { 54, 4, 22, 36, 10, 20, 49 };
		Predicate<Integer> checkEven = i -> i % 2 == 0;
		Predicate<Integer> lessThanTen = i -> i > 10;

		for (int number : numbers) {
			if (checkEven.and(lessThanTen).test(number))
				System.out.println(number);
		}
	}

}
