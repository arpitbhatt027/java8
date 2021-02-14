package lambda;

interface I {
	void show();
}

/*
 * class Abc implements I {
 * 
 * @Override public void show() { System.out.println("show method"); }
 * 
 * }
 */

public class LabdaExpression1 {

	public static void main(String[] args) {
		I obj;
		obj = () -> System.out.println("show method");		
		obj.show();
	}

}
