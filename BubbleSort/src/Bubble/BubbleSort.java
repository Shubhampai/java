package Bubble;

public class BubbleSort {
	
//function file
	
private Integer data[];

	
	
	public static  void printArray(Integer[] data) {
 
		for(int i = 0;i<data.length;i++) {
		
			System.out.print(" " + data[i]);
		}//for
		
		
	}//print
	
	
	public  static void Bubble(Integer[] data) {
		int temp = 0;
	for(int i=0; i< data.length; i++) {
		
		for(int j=0; j<data.length -i -1 ;j++) {
			
			if (data[j] > data[j+1]) {
				
			temp=data[j];
			data[j]=data[j+1];
			data[j+1]=temp;
				
				
			}//if
		}//for
	
	}//for
		
	
	}//bubble



//contructor
	public BubbleSort(Integer[] data) {
		this.data = data;
	}

}
