package temp;

class Sam{
	public static void display() {
		System.out.println("method 1");
	}
}
public class StaticOverride extends Sam{
	public static void display() {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		display();
	}
}
