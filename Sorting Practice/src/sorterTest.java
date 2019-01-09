import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class sorterTest {

	//Class doesnt really work yet, but can using print debugging to find that sorting methods work
	
	ArrayList<Integer> sample;
	sorter sort;
	 @Before
	 public void setup() {
		sample = new ArrayList<Integer>();
		sample.add(8);
		sample.add(3);
		sample.add(1);
		sample.add(5);
		sample.add(2);
		sample.add(7);
		sample.add(6);
		sample.add(4);
		sort = new sorter();
	 }
	
	
	
	@Test
	public void testBubble() {
		
		sort.bubbleSort(sample);
		
		for(int i = 0; i < sample.size()-1; i++) {
			assertEquals(Integer.valueOf(i+1), sample.get(i));
		}
		sort.printList(sample);
	}

}
