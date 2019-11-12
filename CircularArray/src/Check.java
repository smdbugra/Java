
public class Check {

	public static void main(String[] args) {
		ArrayQueue<Integer> myQueue = new ArrayQueue<Integer>();
		myQueue.enqueue(12);
		myQueue.enqueue(8);
		myQueue.enqueue(6);
		myQueue.enqueue(1);
		myQueue.enqueue(3);
		
		myQueue.printQueue();
		myQueue.printCircularArray();
		
		myQueue.dequeue();
		myQueue.dequeue();
		System.out.println();
		myQueue.printQueue();
		myQueue.printCircularArray();
		
		myQueue.enqueue(99);
		myQueue.enqueue(88);
		System.out.println();
		myQueue.printQueue();
		myQueue.printCircularArray();
		
//	 	 Decommenting the following two lines results in an illegal state 
//		 exception thrown by the method ArrayQueue.enqueue
//		 myQueue.enqueue(5);
//		 myQueue.enqueue(11);

	}

}
