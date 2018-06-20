package com.qt;

import java.util.Iterator;
import java.util.List;

import com.ans.Answer;

public class QT {
	private int qt_id;
	private String qt_name;
	private List<Answer> ans;
	public QT(int qt_id, String qt_name, List<Answer> ans) {
		super();
		this.qt_id = qt_id;
		this.qt_name = qt_name;
		this.ans = ans;
	}
	
	public void display() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("QT_ID     QT_NAME");
		System.out.println("-------------------");
		System.out.println();
		System.out.print(qt_id+"      "+qt_name);
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		System.out.println("Answer are");
		System.out.println("----------------");
		System.out.println();
		Iterator<Answer> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
