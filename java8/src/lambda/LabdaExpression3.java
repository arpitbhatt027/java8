package lambda;

public class LabdaExpression3 {

	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Child thread - " + i);
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 3; i++) {
			System.out.println("Main thread - " + i);
		}
	}

}
