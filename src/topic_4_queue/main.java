package topic_4_queue;

public class main {

	public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Connie"));
	     customerQueue.enqueue(new Customer("idul"));
	     customerQueue.enqueue(new Customer("pagskie"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}