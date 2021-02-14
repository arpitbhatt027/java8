package lambda;

@FunctionalInterface
interface Sum {
	void sum(int a, int b);
}

public class LabdaExpression2 {

	public static void main(String[] args) {
		Sum s;
		s = (a, b) -> System.out.println("The sum is " + (a + b));
		s.sum(5, 9);
	}

}
