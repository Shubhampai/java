package Bubble;


//main file
public class App {

	public static void main(String[] args) {
		
		Integer arr[]= {3,2,5,1,4};
		
		//using static void
		System.out.print("\n array before sorting  : ");
		BubbleSort.printArray(arr);
		
		BubbleSort.Bubble(arr);
		
		System.out.print("\n array after sorting  : ");
		BubbleSort.printArray(arr);
		
			
		
		/*
		 	//using without static void
		 
		 	BubbleSort a = new BubbleSort(arr);
			
			System.out.print("\n array before sorting  : ");
			a.printArray();
			
			//sorting the elements
			a.Bubble();
			
			
			System.out.print("\n array after sorting  : ");
			a.printArray();
		*/
			
			
	}//main

}
