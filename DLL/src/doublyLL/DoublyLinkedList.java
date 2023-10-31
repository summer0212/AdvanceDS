package doublyLL;

public class DoublyLinkedList {
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {

		return head == null;
	}

	public void addDLL(int data) {
		Node newNode = new Node(data);
		if (isEmpty())
		{
			head = newNode;
			tail=newNode;
		} else 
		 {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail=newNode;
			
		 }
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("The linked list is empty");
		}
		else
		{
			Node currentPtr=head;
			while(currentPtr != null)
			{
				System.out.println(currentPtr.getData());
				currentPtr=currentPtr.getNext();
			}
			System.out.println("Above are the data of linked list");
		}
	}
}
 

