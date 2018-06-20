package bean;

import user.User;

public class Qt {
	
	private int qt_no;
	private String qt_name;
	private User user;
	public int getQt_no() {
		return qt_no;
	}
	public void setQt_no(int qt_no) {
		this.qt_no = qt_no;
	}
	public String getQt_name() {
		return qt_name;
	}
	public void setQt_name(String qt_name) {
		this.qt_name = qt_name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public void display() {
		System.out.println();
		System.out.println();
		System.out.println("No         Question "  );
		System.out.println("----------------------");
		System.out.println();
		System.out.println(qt_no+"      "+qt_name);
		System.out.println();
		System.out.println("Answer");
		System.out.println("----------");
		System.out.println();
		System.out.println(user);
	}
}
