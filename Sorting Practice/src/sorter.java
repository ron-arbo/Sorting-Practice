import java.util.List;

public class sorter {

	public sorter(){
		
	}
	
	public void printList(List<Integer> toPrint) {
		for(Integer i: toPrint) {
			System.out.print(toPrint.get(i) + " ");
		}
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
	
	//Swaps two values in a list (parameter is the index)
	public void swap(List<Integer> list, int first, int second) {
		Integer temp = list.get(first);
		list.set(first, list.get(second));
		list.set(second, temp);
	}
	
	
}
