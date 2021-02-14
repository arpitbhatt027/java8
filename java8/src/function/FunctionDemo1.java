package function;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		Function<Integer, Integer> squareFunction = number -> number * number;
		System.out.println(squareFunction.apply(5));

		Function<String, Integer> lengthFunction = name -> name.length();
		System.out.println(lengthFunction.apply("arpitbhatt"));
	}

}
