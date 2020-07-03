package TestCases;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
	Node head;

	public static void main(String[] args) {
		
		linkedList list = new linkedList();
		Node first=new Node(1);
		list.head=first;
		
		Node second=new Node(2);
		first.next=second;
		Node third=new Node(3);
		second.next=third;
		list.pintList();
		
		
	
	}
	void pintList() {
		
		Node n=head;
		while (n!=null) {
			System.out.println(n.data);
			n=n.next;
			
		}
	}
	
}

class Node {
	int data;
	Node next;
	
	Node(int n){
		data=n;
		next=null;
		
	}
	
	
}