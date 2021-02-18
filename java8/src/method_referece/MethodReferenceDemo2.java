package method_referece;

interface Interf1 {
	public void interfaceMethod();
}

public class MethodReferenceDemo2 {

	public void classMethod() {
		System.out.println("method reference");
	}

	public static void main(String[] args) {
		Interf1 i1 = () -> System.out.println("By Lambda");
		i1.interfaceMethod();

		MethodReferenceDemo2 m1 = new MethodReferenceDemo2();
		Interf1 i2 = m1::classMethod;
		i2.interfaceMethod();
	}

}
