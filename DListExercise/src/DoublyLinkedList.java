
public class DoublyLinkedList {
	public static class Node {
		private int element;
		private Node prev;
		private Node next;
		public Node(int e, Node p, Node n) {
			element=e;
			prev=p;
			next=n;
		}
		public int getElement() {
			return element;
		}
		public void setElement(int e) {
			element=e;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node p) {
			prev=p;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node n) {
			next=n;
		}

	}
	private Node header;
	private Node trailer;
	private int size=0;
	@SuppressWarnings("null")
	public DoublyLinkedList() {
		header=new Node(0,null,null);
		trailer=new Node(0,header,null);
		header.setNext(trailer);

	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("(");  // beginning of the list 
		// traversing the list and appending all list elements to the string
		Node walk = header.getNext();
		while (walk != trailer) {
			sb.append(walk.getElement());
			walk = walk.getNext();
			if (walk != trailer)
				sb.append(", ");  // for separating list elements
		}
		sb.append(")");  // end of the list
		return sb.toString();
	}
	public void addFirst(int e) {
		addBetween(e, header, header.next);
	}
	public void addLast(int e) {
		addBetween(e, trailer.prev, trailer);
	}

	public int removeFirst() {
		return remove(header.next);

	}
	public int removeLast() {
		return remove(trailer.prev);
	}
	public int remove(Node node) {
		if(isEmpty())
			return 0;
		node.getNext().setPrev(node.getPrev());
		node.getPrev().setNext(node.getNext());
		size--;
		return node.getElement();
	}
	public void addBetween(int e,Node predecessor,Node succesor) {
		Node newNode=new Node(e,predecessor,succesor);
		predecessor.setNext(newNode);
		succesor.setPrev(newNode);
		size++;
	}

}
