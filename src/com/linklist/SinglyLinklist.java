package com.linklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	private String data;
	private Node next;

	public Node() {
	}

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	public String getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class LinkList {
	protected Node head;
	protected Node currentNode;
	
	public boolean checkEmpty() {
		if (head == null)
			return false;
		return true;
	}
	public int getSize() {
		int size = 0;
		if(head == null)
			return 0;
		currentNode = head;
		while(currentNode!=null) {
			size++;
		}
		return size;
	}
	
	public void insertDataAtBegin(String data) {
		if(head == null)
			head = new Node(data);
		else {
			currentNode = new Node(data);
			currentNode.setNext(head.getNext());
			head = currentNode;
		}
		
	}
	
	public void insertData(String data) {
		if (head == null)
			head = new Node(data);
		else {
			currentNode = head;
			while (currentNode != null) {
				currentNode = currentNode.getNext();
			}
			currentNode = new Node(data);
		}
	}

	public void insertDataAtPosition(String data, int position) {
		Node newNode = new Node(data);
		// postion = postion - 1;
		if (position == 0)
			insertDataAtBegin(data);
		else {
			currentNode = head;
			while (currentNode.getNext() != null && position != 1) {
				currentNode = currentNode.getNext();
				position--;
			}
			newNode.setNext(currentNode.getNext());
			currentNode.setNext(newNode);
			if (position != 1)
				System.out.println(" postion greater then list size so inserting at last index");
		}

	}
	
	public void travseList() {
		currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

	public int deleteData(String data) {
		currentNode = head;
		if (head != null && head.getData().equals(data)) {
			currentNode = head.getNext();
			head.setNext(null);
			head = currentNode;
			return 0;
		}
		while (currentNode.getNext() != null) {
			if (data.equals(currentNode.getNext().getData())) {
				System.out.println("Delete Elemnet is=" + currentNode.getNext().getData());
				currentNode.setNext(currentNode.getNext().getNext());
			}
			currentNode = currentNode.getNext();
		}
		return 0;

	}
	
	public int deleteDataAtPosition(String data, int position) {
		if(position == 0) {
			deleteData(data);
			return 0;
		}
		currentNode = head;
		
		while(currentNode.getNext()!=null && position !=1) {
			currentNode = currentNode.getNext();
			position --;
		}
		currentNode.setNext(currentNode.getNext().getNext());
		return 0;
		}

	public int searchData(String data) {
		currentNode = head;
		while (currentNode != null) {
			if (data.equals(currentNode.getData())) {
				System.out.println(currentNode.getData());
				return 0;
			}
			currentNode = currentNode.getNext();

		}
		return 0;
	}
	
	public void reverseListWithData() {

	}
	
	public void reverseListWithLinking() {
		Node prev = null;
		Node next = null;
		currentNode = head;
		while(currentNode !=null) {
			next = currentNode.getNext();
			currentNode.setNext(prev);
			prev = currentNode;
			currentNode = next;
		}
		head = prev;
	}
	
	public void sortList() {
		
	}
	
	public void find_kth_element() {
		
	}
	
	public void rotat_in_segment(int pivt) {
		
	}
	
	public void mergeTwoLinkList() {
		
	}
	
	public void findMergePointInTwoLinkList() {
		
	}

}

public class SinglyLinklist {

	public static void main(String[] args) throws IOException {

		LinkList linklist = new LinkList();
		String ch;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("=================================Singly Linked List Test===================================");
		do {
			System.out.println("Singly Linked List Operations");
			System.out.println("1. Insert at Begining");
			System.out.println("2. Insert at End/Data");
			System.out.println("3. Insert at Position");
			System.out.println("4. Deletion the Data");
			System.out.println("5. Deletion at Position");
			System.out.println("6. Check Empty");
			System.out.println("7. Check Size");
			System.out.println("8. Search the Data");
			System.out.println("9. Travsal the Link List");
			System.out.println("10. Reverse with Data the Link List");
			System.out.println("11. Reverse with Address the Link List");
			System.out.println("12. Sort the Link List");
			System.out.println("13. Kth Last Element");
			System.out.println("14. Rotation in Segment");
			System.out.println("15  Merge Two Link List");
			System.out.println("16. Find merge Point in Two Link List");
			System.out.println("17. Find Middle Point(count/2)");
			System.out.println("18. Find Middle Point(travsrse 2 point) ");
			System.out.println("19. Find n’th node from the end of a Linked List");
			System.out.println("20. Find the data using position(get Nth node)");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				System.out.println("\nPlease Enter the insert Element:\n");
				linklist.insertDataAtBegin(br.readLine());
				break;
			case 2:
				System.out.println("\nPlease Enter the insert Element:\n");
				linklist.insertData(br.readLine());
				break;
			case 3:
				System.out.println("\nPlease Enter deletion Element:\n");
				String data = br.readLine();
				System.out.println("\n Please Enter the Position:\n");
				int pos = br.read();
				linklist.insertDataAtPosition(data,pos);
				break;
			case 4:
				System.out.println("\nPlease Enter deletion Element:\n");
				linklist.deleteData(br.readLine());
				break;
			case 5:
				System.out.println("\nPlease Enter deletion Element:\n");
				String da = br.readLine();
				System.out.println("\n Please Enter the Position:\n");
				int posi = br.read();
				linklist.deleteDataAtPosition(da,posi);
				break;
			case 6:
				
				System.out.println("The LinkList is "+(linklist.checkEmpty()==false?"Empty":" Not Empty"));
				break;
			case 7:
				System.out.println("The LinkList size is ="+linklist.getSize());
				break;
			case 8:
				System.out.println("\nPlease Enter Searching Element:\n");
				linklist.searchData(br.readLine());
				break;
			case 9:
				linklist.travseList();
				break;
			case 10:
				linklist.reverseListWithData();
				break;
			case 11:
				linklist.reverseListWithLinking();
				break;
			case 12:
				linklist.sortList();
				break;
			case 13:
				linklist.find_kth_element();
				break;
			case 14:
				linklist.rotat_in_segment(br.read());
				break;
			case 15:
				linklist.mergeTwoLinkList();
				break;
			case 16:
				linklist.findMergePointInTwoLinkList();
				break;
			default:
				System.out.println("Choose Worng Input");
				break;
			}
			System.out.println("Do you want to contiune (Type y or n)");
			ch = br.readLine();
		}while(ch.equalsIgnoreCase("Y") || ch.equalsIgnoreCase("Yes"));
	}

}
