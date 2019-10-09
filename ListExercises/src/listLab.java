
public class listLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList myList = new SinglyLinkedList();

		myList.addFirst("15");
		myList.addFirst("46");
		myList.addFirst("98");
		myList.addFirst("15");
		System.out.println("Linked List Contents:");
		myList.printList();

		String removedElement = myList.removeFirst();
		System.out.println("\nRemoved item is: " + removedElement);
		System.out.println("\nList Contents After Remove First Operation:");
		myList.printList();

		myList.addLast("42");
		System.out.println("\nList Contents After Add Last Operation:");
		myList.printList();

		removedElement = myList.removeLast();
		System.out.println("\nRemoved item is: " + removedElement);
		System.out.println("\nList Contents After Remove Last Operation:");
		myList.printList();
	}

}
