package mainclass;

public class MC {
	
	public void valid(int age) throws Exception {
		if(age<18) {
			System.out.println();
			System.out.println("Your Age is bellow 18 Years");
			throw new Exception("Not Eligible to Vote");
		}else {
			System.out.println();
			System.out.println("Your Age is : "+age);
			System.out.println("Eligible to Vote");
		}
	}
}
