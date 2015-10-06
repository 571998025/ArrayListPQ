public class ArrayListPQ implements PriorityQueue {
	private MyArrayList myList = new MyArrayList(2);
	
	public boolean isEmpty() {
		return myList.isEmpty();
	}
	
	public int size() {
		return myList.size();
	}
	
	public Object peek() {
		return myList.get(maxIndex());
	}
	
	private int maxIndex() {
		if (isEmpty()) {
			throw new IllegalStateException();
		}
		
		int max = 0;
		
		for (int i = 1; i < myList.size(); i++) {
			Comparable c = (Comparable) myList.get(i);
			if (c.compareTo(myList.get(max)) > 0) max =i;
		}
	
		return max;
	}
	
	public void enQueue(Object e) {
		// your code
	}
	
	public Object deQueue() {
		// your code
	}
}

