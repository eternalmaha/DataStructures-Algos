
public class BinarySearchTreeDemo2 {

	public static void main(String[] args) {
		
		NodeBasedBinarySearchTree<Integer> myTree = new NodeBasedBinarySearchTree<Integer>();
		
		myTree.add(40);
		myTree.add(13);
		myTree.add(45);
		myTree.add(98);
		myTree.add(26);
		myTree.add(8);
		myTree.add(99);
		
		System.out.println(myTree.contains(13)); 
		
		System.out.println(myTree.contains(99)); 
		
		System.out.println(myTree.contains(1)); 
		
	
		
		//GET THE ZYBOOKS PIC OF REMOVE!!!
		
		System.out.println(myTree.remove(99));
		
		System.out.println(myTree.remove(45)); 
		
		System.out.println(myTree.remove(40)); 
		
	}

}
