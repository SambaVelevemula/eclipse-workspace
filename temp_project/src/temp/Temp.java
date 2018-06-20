package temp;

class Sample{
	public Sample() {
		System.out.println("Parent Constructor");
	}
}
public class Temp extends Sample {
	
	public static void main(String[] args) {
		new Temp();

	}

}
