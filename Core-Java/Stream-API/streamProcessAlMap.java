/**
* 2. Program to double the object value by 2 

	List<Integer> doubleList = arrayList.stream().map(integer -> integer*2).collect(Collectors.toList());
	
	map() is used here to create new objects for every object in the list.
*
*/
import java.util.*;
import java.util.stream.*;

public class streamProcessAlMap {

	public static void doubleTheValue(ArrayList<Integer> arrayList) {
		System.out.println("Elements after doubling(Traditional way):");
		ArrayList<Integer> doubleList = new ArrayList<>();
		
		for(Integer integer : arrayList) {
			doubleList.add(integer*2);
		}	
		Iterator iterator = doubleList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
	
	public static void doubleTheValueUsingStream(ArrayList<Integer> arrayList) {
		System.out.println("Elements after doubling(using stream):");
		List<Integer> doubleList = arrayList.stream().map(integer -> integer*2).collect(Collectors.toList());
		
		System.out.println("Displaying elements using lambda expression with forEach");
		doubleList.forEach(integer->System.out.println(integer));
		
		System.out.println("Displaying elements using method reference with forEach");
		doubleList.forEach(System.out::println);
		
		
	}
	
	
	public static void main(String [] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	
	arrayList.add(10);
	arrayList.add(12);
	arrayList.add(15);
	arrayList.add(17);
	arrayList.add(20);
	arrayList.add(22);
	arrayList.add(25);
	arrayList.add(27);
	
	System.out.println("Displaying elements present in the ArrayList before doubling");
	Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	doubleTheValue(arrayList);
	doubleTheValueUsingStream(arrayList);
	}
}


/****************************************************************************************************************************************/
/*						Output		
Displaying elements present in the ArrayList before doubling
10
12
15
17
20
22
25
27
Elements after doubling(Traditional way):
20
24
30
34
40
44
50
54
Elements after doubling(using stream):
Displaying elements using lambda expression with forEach
20
24
30
34
40
44
50
54
Displaying elements using method reference with forEach
20
24
30
34
40
44
50
54
*/											


