package com.bl.linked;

public class LinkList {
	MyNode node;
	MyNode tail;
	MyNode head;

	public void add(int num) {
		MyNode node1 = new MyNode(num);
		if (head == null) {
			this.node = node1;
			this.head = node1;
			this.tail = node1;
		} else {
			tail.next= node1;
			tail = node1;
		}
	}

	public void display() {
		MyNode newnode = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		} 
		else {
			System.out.println("Nodes of linked list is :");
			while (newnode != null) {
				System.out.print(newnode.num + " ");
				newnode = newnode.next;
			}
			System.out.println();
		}
	}
}

