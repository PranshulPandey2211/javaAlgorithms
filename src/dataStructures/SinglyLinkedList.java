package dataStructures;

import java.util.Scanner;

public class SinglyLinkedList{
	private Node head;

	public SinglyLinkedList(){
	    head = null;
	}

	public void display(){
        Node n = head;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
        System.out.println();
	}

	public void countNodes(){
		Node n = head;
        int count = 0;
		while(n != null){
			count++;
			n = n.next;
		}
		System.out.println("Number of nodes= " + count);
	}

	public boolean hasLoop(){
		if(findLoop() == null)
			return false;
		else
			return true;
	}

	private Node findLoop(){
		if(head == null || head.next == null)
            return null;
		Node selectedNodeSlow = head;
        Node selectedNodeFast = head;
		while(selectedNodeFast != null && selectedNodeFast.next != null) {
			selectedNodeSlow = selectedNodeSlow.next;
			selectedNodeFast = selectedNodeFast.next.next;
			if( selectedNodeSlow == selectedNodeFast )
				return selectedNodeSlow;
		}
        return null;
	}

	public int findNode(int key){
		Node n = head;
		int position = 1;
		while(n != null){
			if(n.val == key)
				break;	
			position++;
			n = n.next;
		}
		if(n == null)
			return -1;
		else
			return position;
	}

	public void insertTail(int data){
		Node newNode;
		Node temp = new Node(data);
		if(head == null){
			head = temp;
			return;
		}
		newNode = head;
		while(newNode.next != null)
			newNode = newNode.next;
		newNode.next = temp;
	}

	public void insertNth(int data, int position){
		Node newNode;
		int i = 1;
		if(position == 1){
			newNode = new Node(data);
			newNode.next = head; 
			head = newNode;
			return;
		}
		Node n = head;
        while(i < position - 1 && n != null){
            n = n.next;
            i++;
        }
		if(n == null)
			return;
		else{
			newNode = new Node(data);
			newNode.next = n.next;
			n.next = newNode;
		}	
	}

	public void createList(){
		int i, n, val;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter the number of nodes : ");
		n = in.nextInt();
		if(n == 0)
			return;
		for(i = 1; i <= n; i++){
			System.out.print("Enter the element: ");
			val = in.nextInt();
			insertTail(val);
		}
	}

	public void deleteNth(int position){
		if(head == null)
			return;
		if(head.val == position){
			head = head.next;  
			return;
		}
		Node p = head;
		while(p.next != null){
			if(p.next.val == position)   
				break;	
			p = p.next;
		}
		if(p.next == null)
            return;
		else
			p.next = p.next.next;
	}

	public void reverseList(){
		Node prev = null, n = head, next;
		while(n != null){
			next = n.next;
			n.next = prev;
			prev = n;
			n = next;
		}
		head = prev;
	}
}
class Node {
     public int val;  
     public Node next;
     public Node(int val) {
		this.val = val;
		next = null;
	 }
}