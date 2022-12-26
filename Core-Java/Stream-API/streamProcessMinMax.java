/**
*
*	6. Program to find minimum and maximum element using min() and max() in stream API 
*
*
*/
import java.util.*;
import java.util.stream.*;

public class streamProcessMinMax {

	public static void main(String[] args) {
	ArrayList<String> arrayList = new ArrayList<>();
		
			arrayList.add("A");
			arrayList.add("AAA");
			arrayList.add("AAA");
			arrayList.add("AAAAA");
			arrayList.add("AAAAAA");
			arrayList.add("AAAAAAAAA");
			arrayList.add("15");
			arrayList.add("20");
			arrayList.add("10");
			arrayList.add("10");
			
		System.out.println("Displaying elements present in the ArrayList");
		Iterator iterator = arrayList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
	 findMinimumElement(arrayList);
	 findMaximumElement(arrayList);
	 findDistinctElement(arrayList);
	
	}
	
	public static void findMinimumElement(ArrayList<String> arrayList) {
		String minElement = arrayList.stream().min((string1,string2)->string1.compareTo(string2)).get();
		System.out.println("Minimum element in the List:"+minElement);
	}
	
	public static void  findMaximumElement(ArrayList<String> arrayList) {
		String maxElement = arrayList.stream().max((string1,string2)->string1.compareTo(string2)).get();
		System.out.println("Maximum element in the List:"+maxElement);
	}
	
	public static void findDistinctElement(ArrayList<String> arrayList) {
	List<String> distinctElement = arrayList.stream().distinct().collect(Collectors.toList());//distinct method eliminates duplicates
	System.out.println("Distinct element in the List:");
	distinctElement.forEach(System.out::println);
	
	}
}

/******************************************************************************************************************************/
/*			Output 												*/
/* 
	Displaying elements present in the ArrayList
	A
	AAA
	AAAAA
	AAAAAA
	AAAAAAAAA
	15
	20
	17
	Minimum element in the List:15
	Maximum element in the List:AAAAAAAAA
	Distinct element in the List:
	A
	AAA
	AAAAA
	AAAAAA
	AAAAAAAAA
	15
	20
	10



*/
