package com.bl.linked;
import java.util.LinkedList;

public class LinkedListProgram {
	public static void main(String[] args) {
		System.out.println("Welcome To Linked List Program");

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(30);
		list.add(70);
		System.out.println("Elements are:" + "->" + list);
	}
}	