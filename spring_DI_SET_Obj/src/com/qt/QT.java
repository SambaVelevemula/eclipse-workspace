package com.qt;

import java.util.Iterator;
import java.util.Set;

import com.user.User;

public class QT {
	
	private int qt_no;
	private String qt_name;
	private Set<User> ans;
	
	
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
	public Set<User> getAns() {
		return ans;
	}
	public void setAns(Set<User> ans) {
		this.ans = ans;
	}
	
	
	public void display() {
		
		System.out.println();
		System.out.println();
		System.out.println("Qt_No            Question");
		System.out.println("--------------------------");
		System.out.println(qt_no+"            "+qt_name);
		System.out.println();
		System.out.println("Answers");
		System.out.println("-----------------");
		System.out.println();
		Iterator<User> it=ans.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
