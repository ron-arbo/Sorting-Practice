import java.util.ArrayList;

public class SortingDriver {

	public static void main(String[] args) {
		sorter sortingMachine = new sorter();
		
		ArrayList<Integer> sample = new ArrayList<Integer>();
		sample.add(8);
		sample.add(3);
		sample.add(1);
		sample.add(5);
		sample.add(2);
		sample.add(7);
		sample.add(6);
		sample.add(4);
		
		//To test, toggle comment on whichever blocks of code you DON'T want to test
		
//		sortingMachine.printList(sample);
//		System.out.println();
//		sortingMachine.bubbleSort(sample);
//		sortingMachine.printList(sample);
//		
//		sortingMachine.printList(sample);
//		System.out.println();
//		sortingMachine.selectionSort(sample);
//		sortingMachine.printList(sample);
		
		sortingMachine.printList(sample);
		System.out.println();
		sortingMachine.quickSort(sample);
		sortingMachine.printList(sample);
		
	}
	
	
	
	
}
