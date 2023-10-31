package core.linkedList;

import java.util.Scanner;
class Node
{
	private int data;
	private Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}


public class LinkedList 
{
	private Node head;
	private Node tail;
	
	public LinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else//if(head!=null)
		{
			Node currentPointer=head;
			while(currentPointer.getNext() != null)
			{
				//System.out.println("AA");
				currentPointer=currentPointer.getNext();
			}
//			Node s=currentPointer.getNext();
//			s=newNode;
			
			currentPointer.setNext(newNode);
			//currentPointer.getNext();
		}
		
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("SLL is empty");
		}
		else
		{
		Node currentPointer=head;
			while(currentPointer != null)
			{
				System.out.println(currentPointer.getData());
				currentPointer=currentPointer.getNext();
			}
	
		}
	}
	
}
