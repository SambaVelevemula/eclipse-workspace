package com.qt;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ans.Answer;
import com.user.User;

public class Qt {
	private int id;
	private String qt;
	private Map<Answer,User> answers;
	public Qt(int id, String qt, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.qt = qt;
		this.answers = answers;
	}
	
	public void display() {
		
		System.out.println();
		System.out.println();
		System.out.println("Quest_ID        Question");
		System.out.println("---------------------------");
		System.out.println(id+"                "+qt);
		System.out.println();
		System.out.println("Answers");
		System.out.println("------------------------");
		System.out.println();
		Set<Entry<Answer,User>> set=answers.entrySet();
		Iterator<Entry<Answer,User>> it=set.iterator();
		while(it.hasNext()) {
			Entry<Answer,User> entry=it.next();
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}
	}
}
