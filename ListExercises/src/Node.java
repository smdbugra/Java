
public class Node {
	private String element;
	private Node next;
	public Node(String e, Node n) {
		element=e;
		next=n;
	}
	public String getElement() {
		return element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node n) {
		next=n;
	}
	
}
