
public class SinglyLinkedList {
	private Node head=null;
	private Node tail=null;
	private int size=0;
	public SinglyLinkedList() {
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size==0)
			return true;
		return false;
	}
	public String first() {
		if(isEmpty())
			return null;
		return head.getElement();
	}
	public String last() {
		if(isEmpty())
			return null;
		return tail.getElement();
	}
	public void addFirst(String e) {
		head=new Node(e,head);
		if(size==0)
			tail=head;
		size++;
	}
	public void addLast(String e) {
		Node newest=new Node(e,null);
		if(isEmpty())
			head=newest;
		else
			tail.setNext(newest);
		tail=newest;
		size++;

	}
	public String removeFirst() {
		if(isEmpty())
			return null;
		String answer=head.getElement();
		head=head.getNext();
		size--;
		if(size==0)
			tail=null;
		return answer;


	}
	public String removeLast() {
		if(isEmpty())
			return null;
		if(size==1) {
			head=null;
			tail=null;
		}

		Node second_last = head;
		while (second_last.getNext().getNext() != null) 
			second_last = second_last.getNext(); 

		// Change next of second last 
		String answer=second_last.getNext().getElement();
		second_last.setNext(null); 
		tail=second_last;
		size--;
		return answer;


	}
	public void printList() {
		if(isEmpty())
			System.out.println("List is Empty");
		Node print=head;
		while(print!=null) {
			System.out.println(print.getElement());
			print=print.getNext();
		}

	}


}
