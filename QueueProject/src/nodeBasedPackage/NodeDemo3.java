package nodeBasedPackage;

import arrayBasedPackage.QueueEmptyException;

public class NodeDemo3 {

	public static void main(String[] args) {
		
		NodeBasedQueue<String> playlist = new NodeBasedQueue<String>(); 
		
		playlist.enqueue("Limelight");
		
		playlist.enqueue("Jamie's Crying");
		
		playlist.enqueue("Cold");
		
		System.out.println(playlist.look()); 
		
		try {
			System.out.println(playlist.dequeue()); 
			System.out.println(playlist.dequeue()); 
			System.out.println(playlist.dequeue()); 
		} catch(QueueEmptyException e){
			System.out.println(e.getMessage());
		}

	}

}
