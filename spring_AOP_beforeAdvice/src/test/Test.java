package test;


public class Test {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println();
		System.out.println("Welcome : "+name);
	}
}
