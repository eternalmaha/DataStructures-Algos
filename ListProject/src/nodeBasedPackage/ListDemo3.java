package nodeBasedPackage;

import arrayBasedPackage.ListInterface;

public class ListDemo3 {

	public static void main(String[] args) {


		ListInterface<String> myFavoriteBandList = new NodeBasedList<String>();
		
		myFavoriteBandList.add("The Byrds");
		myFavoriteBandList.add("Van Halen");
		myFavoriteBandList.add("Rush");
		myFavoriteBandList.add("The Police");
		
		
		System.out.println(myFavoriteBandList.find("The aliens"));
		System.out.println(myFavoriteBandList.find("Rush"));
			
		System.out.println(myFavoriteBandList.toString()); 
		
		myFavoriteBandList.remove("The Byrds");
		System.out.println(myFavoriteBandList.toString()); 
	}

}
