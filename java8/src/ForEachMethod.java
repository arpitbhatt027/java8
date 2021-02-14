

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 6, 7, 8, 9);

		// Iterating ways
		// 1 - by using loop
		// 2 - by using foreach loop/external loop

		/*
		 * for (int number : numbers) { System.out.println(number); }
		 */

		// 3 - by foreach method/ internal loop
		numbers.forEach(number -> System.out.println(number)); // lambda

	}

}