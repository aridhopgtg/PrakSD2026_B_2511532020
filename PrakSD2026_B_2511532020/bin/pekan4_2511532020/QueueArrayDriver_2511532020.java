package pekan4_2511532020;

public class QueueArrayDriver_2511532020 {

	public static void main(String[] args) {
	  QueueArray_2511532020 queue = new QueueArray_2511532020(1000);
	  queue.enqueue_2511532020(10);
	  queue.enqueue_2511532020(20);
	  queue.enqueue_2511532020(30);
	  queue.enqueue_2511532020(40);
	  System.out.println("item di depan " + queue.front_2020());
	  System.out.println("item paling belakang " + queue.rear_2020());
	  System.out.println("tampilan queue");
	  
	  queue.display_2511532020();
	  System.out.println(queue.dequeue_2511532020() + " dihapus dari queue");
	  System.out.println("item di depan: " + queue.front_2020());
	  System.out.println("item paling belakang " + queue.rear_2020());
	  System.out.println("tampilan queue setelah satu data di hapus");
	  queue.display_2511532020();
		

	}

}
