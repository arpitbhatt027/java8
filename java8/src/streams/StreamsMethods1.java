package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods1 {
	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Arpit", "Amit", "Bhanu", "Chetan", "Deepak", "Ellie");
		nameList.stream().filter(str -> str.startsWith("A")).map(String::toUpperCase).sorted()
				.forEach(System.out::println);
		System.out.println("---------------");
		nameList.stream().findFirst().ifPresent(System.out::println);
		System.out.println("---------------");

		List<Integer> numbers = Arrays.asList(10, 5, 78, 69, 56, 21, 55, 99, 43);
		numbers.stream().filter(n -> n > 50).forEach(System.out::println);

		System.out.println("-------------Collectors --");
		List<Integer> newNumberList = numbers.stream().filter(n -> n > 50).collect(Collectors.toList());
		System.out.println(newNumberList);
		numbers.stream().filter(n -> n > 50).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------");
		numbers.stream().sorted().forEach(System.out::println);
	}
}