package arrayBasedPackage;

public class QueueDemo1 {
		
	public static void main(String[] args) {
		//waitlist has a reference type of QueueInterface and reference of anything that implements QueueInterface 
		QueueInterface<String> waitlist = new ArrayBasedQueue<String>(4);
		
		try {
			waitlist.enqueue("Jill"); 
			waitlist.enqueue("Jack");
			waitlist.enqueue("Francesca");
			waitlist.enqueue("Ishraga");
			waitlist.enqueue("Asma");
			
			
			//System.out.println(waitlist.look()); 
			System.out.println(waitlist.look());
			
		} catch(QueueFullException e) {
			System.out.println(e.getMessage()); 
		}
		
		try {
			waitlist.dequeue();
			waitlist.dequeue(); 
			System.out.println("Dequeue: " + waitlist.dequeue()); 
			System.out.println(waitlist.look()); 
		} catch(QueueEmptyException e){
			System.out.println(e.getMessage()); 
		}
		
		
	}
}
