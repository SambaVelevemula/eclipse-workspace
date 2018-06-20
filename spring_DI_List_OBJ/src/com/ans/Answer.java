package com.ans;

public class Answer {
	private String ans;
	private String by;
	public Answer(String ans, String by) {
		super();
		this.ans = ans;
		this.by = by;
	}
	
	public String toString() {
		
		return ans+"     Posted by  "+by;
	}
}
