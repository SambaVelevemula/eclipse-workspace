package temp;

public class Clone implements Cloneable {
	
	Clone(){
		System.out.println(" first constructor");
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Clone c1=new Clone();
		Clone c2=(Clone)c1.clone();
		
	}

}