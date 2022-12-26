/**
*
*	5. Program to find minimum and maximum element using min() and max() in stream API 
*
*
*/
import java.util.*;
import java.util.stream.*;

public class StreamProcessMinMax {

	public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
		
			arrayList.add(27);
			arrayList.add(10);
			arrayList.add(25);
			arrayList.add(12);
			arrayList.add(22);
			arrayList.add(15);
			arrayList.add(20);
			arrayList.add(17);
			
		System.out.println("Displaying elements present in the ArrayList");
		Iterator iterator = arrayList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	 findMinimumElement(arrayList);
	 findMaximumElement(arrayList);
	
	}
	
	public static void findMinimumElement(ArrayList<Integer> arrayList) {
		Integer minElement = arrayList.stream().min((integer1,integer2)->integer1.compareTo(integer2)).get();
		System.out.println("Minimum element in the List:"+minElement);
	}
	
	public static void  findMaximumElement(ArrayList<Integer> arrayList) {
		Integer maxElement = arrayList.stream().max((integer1,integer2)->integer1.compareTo(integer2)).get();
		System.out.println("Maximum element in the List:"+maxElement);
	}
}

/****************************************************************************************************************************/
/*				Output												*/
/* 
	Displaying elements present in the ArrayList
	27
	10
	25
	12
	22
	15
	20
	17
	Minimum element in the List:10
	Maximum element in the List:27

*/
