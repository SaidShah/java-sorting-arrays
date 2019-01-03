package sortingArrays;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int[] myArray = new int[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<myArray.length;i++) {
			System.out.print("enter input number "+i+": ");
			myArray[i] = input.nextInt();
		}
		
		System.out.println("---------------------------------------before sorting-----------------------------------------------------");
		printElements(myArray);
		System.out.println("---------------------------------------after sorting------------------------------------------------------");
		int[] sortedArrays = sortArray(myArray);
		printElements(sortedArrays);
	}
	
	private static void printElements(int[] tempArray) {
		int counter =0;
		for(int s:tempArray) {
			System.out.println("the value for element "+counter+++" is: "+s);
		}
	}
	
	private static int[] sortArray(int[] tempArray) {
		int sortedArray[] = new int[tempArray.length];
		for(int i = 0; i<tempArray.length;i++) {
			sortedArray[i] = tempArray[i];
			}
		boolean flag = true;
		int temp;
		
		while(flag) {
			flag=false;
			for(int i = 0; i <sortedArray.length-1;i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
