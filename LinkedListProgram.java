package com.bl.linked;
import java.util.LinkedList;

public class LinkedListProgram {
	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");
		//LinkedList<Integer> list = new LinkedList<Integer>();
		LinkList l1 = new LinkList();
		//list.add(56);
		//list.add(30);
		//list.add(70);
		l1.add(56);
		l1.add(30);
		l1.add(70);
	// System.out.println("Elements are:"  + l1);
		l1.display();
	}
}	