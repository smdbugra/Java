
public class Test {

	public static void main(String[] args) {
		DoublyLinkedList a = new DoublyLinkedList();
		a.addFirst(12);
		a.addFirst(3);
		System.out.print("Initial List Contents: ");
		System.out.println(a);
		
		a.addLast(33);
		System.out.print("\naddLast 33: ");
		System.out.println(a);
		
		Integer result = (Integer) a.removeFirst();
		System.out.print("\nremoveFirst: ");
		System.out.println(a);
		
		result = (Integer) a.removeLast();
		System.out.print("\nremoveLast: ");
		System.out.println(a);
		
		result = (Integer) a.removeLast();
		System.out.print("\nremoveLast: ");
		System.out.println(a);
		
		result = (Integer) a.removeLast();
		System.out.print("\nremoveLast: ");
		System.out.println(a);
	}

}
