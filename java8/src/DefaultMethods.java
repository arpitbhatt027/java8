
interface Phone {

	void call();

	default void message() {
		System.out.println("Message...");
	}
}

class Android implements Phone {

	@Override
	public void call() {
		System.out.println("Calling...");
	}

}

public class DefaultMethods {

	public static void main(String[] args) {
		Phone phone = new Android();
		phone.call();
		phone.message();
	}

}
