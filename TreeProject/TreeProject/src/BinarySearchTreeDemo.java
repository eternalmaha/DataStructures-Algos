
public class BinarySearchTreeDemo {

	public static void main(String[] args) {

		BinarySearchTreeInterface<String> dictionary = new NodeBasedBinarySearchTree<String>();
		
		dictionary.add("maurader");
		dictionary.add("apple"); 
		dictionary.add("summer"); 
		dictionary.add("Buckle"); 
		
		System.out.println(dictionary.contains("Amazon"));
		
		

	}

}
