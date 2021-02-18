package method_referece;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 4, 7, 15, 35, 25, 10, 8);
		numbers.forEach(System.out::println);
	}

}
