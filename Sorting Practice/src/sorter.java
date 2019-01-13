import java.util.ArrayList;
import java.util.List;

public class sorter {

	public sorter(){
		
	}
	
	public void printList(List<Integer> toPrint) {
		for(int i = 0; i < toPrint.size(); i++) {
			System.out.print(toPrint.get(i) + " ");
		}
	}
	
	//Swaps two values in a list (parameter is the index)
		public void swap(List<Integer> list, int first, int second) {
			Integer temp = list.get(first);
			list.set(first, list.get(second));
			list.set(second, temp);
		}
	
	public List<Integer> bubbleSort(List<Integer> unsorted){
		for(int out = unsorted.size()-1; out > 0; out--) {
			for(int in = 0; in < out; in++) {
				if(unsorted.get(in) > unsorted.get(in + 1)) {
					swap(unsorted, in, in+1);
				}
			}
		}
		return unsorted;
	}
	
	public List<Integer> selectionSort(List<Integer> unsorted){
		int maxIndex;
		for(int out = unsorted.size()-1; out > 0; out--) {
			maxIndex = out;
			for(int in = 0; in < out; in++) {
				if(unsorted.get(in) > unsorted.get(maxIndex)) {
					maxIndex = in;
				}
			}
			swap(unsorted, maxIndex, out);
		}
		return unsorted;
	}
	
	public List<Integer> quickSort(List<Integer> unsorted){
		recursiveQSHelper(unsorted, 0, unsorted.size()-1);
		
		return unsorted;
	}
	
	public void recursiveQSHelper(List<Integer> unsorted, int first, int last){
		if(first < last) {
			int threshIndex = partitionQS(unsorted, first, last);
			recursiveQSHelper(unsorted, first, threshIndex-1);
			recursiveQSHelper(unsorted, threshIndex+1, last);
		}
	}
	
	//This method will organize elements based on their relation to a 'thresh' element (higher or lower), must call recursively to sort whole list
	public int partitionQS(List<Integer> unsorted, int first, int last){
		Integer thresh = unsorted.get(last);
		int store = first;
		for(int i = first; i <= last-1; i++) {
			if(unsorted.get(i) <= thresh) {
				swap(unsorted, i, store);
				store++;
			}
		}
		swap(unsorted, last, store);
		return store;
	}
	
	
}
