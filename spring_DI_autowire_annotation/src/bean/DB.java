package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import persion.Persion;

public class DB {
	
	private int id;
	private String Parent;
	
	
	private Persion child;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getParent() {
		return Parent;
	}
	public void setParent(String parent) {
		Parent = parent;
	}
	public Persion getChild() {
		return child;
	}
	@Autowired
	@Qualifier("p")
	public void setChild(Persion child) {
		this.child = child;
	}
	
	public void display() {
		
		System.out.println();
		System.out.println();
		System.out.println("DB Detaails : ");
		System.out.println();
		System.out.println("id        Parent        Child");
		System.out.println("------------------------------");
		System.out.println();
		System.out.println(id+"       "+Parent+"         "+child);
	}
	
}
