
public class ArrayQueue<E> implements Queue<E> {
	public static final int CAPACITY = 6;
	private E[] data;
	private int f=0;
	private int sz=0;
	public ArrayQueue() {
		this(CAPACITY);
	}
	public ArrayQueue(int capacity) {
		data=(E[]) new Object[capacity];
	}
	@Override
	public int size() {
		
		return sz;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return sz==0;
	}

	@Override
	public void enqueue(E e) {
		if(sz==data.length)
			throw new IllegalStateException("Queue is full");
		int rear=(f+sz)%data.length;
		data[rear]=e;
		sz++;
		
	}

	@Override
	public E first() {
		if(isEmpty())
			return null;
		return data[f];
	}

	@Override
	public E dequeue() {
		if(isEmpty())
			return null;
		E answer=data[f];
		data[f]=null;
		f=(f+1)%data.length;
		sz--;
		return answer;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("(");
	    int k = f;
	    for (int j=0; j < sz; j++) {
	      if (j > 0)
	        sb.append(", ");
	      sb.append(data[k]);
	      k = (k + 1) % data.length;
	    }
	    sb.append(")");
	    return sb.toString();
	}
	public void printQueue() {
		System.out.print("Queue contents: ");
		System.out.println(this);
	}
	public void printCircularArray() {
		System.out.print("Circular array contents :");
		for(E e:data)
			System.out.printf("%s ",e);
		System.out.println();
	}
	

}
