package pekan4_2511532020;

public class QueueArray_2511532020 {
	int front_2020, rear_2020, size_2020;
	int capacity_2020;
	int array_2020[];
	
	public QueueArray_2511532020(int capacity_2020) {
		this.capacity_2020 = capacity_2020;
		front_2020 = this.size_2020 = 0;
		rear_2020 = capacity_2020 - 1;
		array_2020 = new int[this.capacity_2020];
		
	}
	
	boolean isFull(QueueArray_2511532020 queue) {
		return (queue.size_2020 == queue.capacity_2020);
	}
	
	boolean isEmpty(QueueArray_2511532020 queue) {
		return (queue.size_2020 == 0);
	}
	
	void enqueue_2511532020(int item_2020) {
		if (isFull(this))
	        return;
		this.rear_2020 = (this.rear_2020 + 1) % this.capacity_2020;
		this.array_2020[this.rear_2020] = item_2020;
		this.size_2020 = this.size_2020 + 1;
		System.out.println(item_2020 + " enqueued to queue");
	}
	
	int dequeue_2511532020() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item_2020 = this.array_2020[this.front_2020];
		this.front_2020 = (this.front_2020 + 1) % this.capacity_2020;
		this.size_2020 = this.size_2020 - 1;
		return item_2020;
	}
	
	int front_2020() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array_2020[this.front_2020];
	}
	
	int rear_2020() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2020[this.rear_2020];
	}
	
	void display_2511532020()  {
		int i;
		if (front_2020 == rear_2020) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		for (i = front_2020; i < rear_2020; i++) {
			System.out.printf(" %d <-- ", array_2020[i]);
		}
		return;
	}

}
