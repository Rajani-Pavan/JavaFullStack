/**
*
*	4. Program to sort the arrayList using sorted methods available in stream API
*
*/

import java.util.*;
import java.util.stream.*;

public class StreamProcessSort {

	public static void sortUsingStreamSorted(ArrayList<Integer> arrayList){
		System.out.println("Elements after sorting using naturural sorting(comparable interface compareTo())");
		List<Integer> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		System.out.println("sorted list using lambda expression");
		sortedList.forEach(i->System.out.println(i));
		
		List<Integer> customSortedList = arrayList.stream().sorted((num1,num2)->num2.compareTo(num1)).collect(Collectors.toList());
		System.out.println("Elements after sorting using customized sorting(comparator interface compare())");
		customSortedList.forEach(System.out::println);
	}
	
	public static void main(String [] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
			arrayList.add(27);
			arrayList.add(10);
			arrayList.add(25);
			arrayList.add(12);
			arrayList.add(22);
			arrayList.add(15);
			arrayList.add(20);
			arrayList.add(17);
			
		System.out.println("Displaying elements present in the ArrayList before Sorting");
		Iterator iterator = arrayList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		sortUsingStreamSorted(arrayList);
	}
}

/************************************************************************************************************************/
/* 						Output									    */
/*
	Displaying elements present in the ArrayList before Sorting
	27
	10
	25
	12
	22
	15
	20
	17
	Elements after sorting using naturural sorting(comparable interface compareTo())
	10
	12
	15
	17
	20
	22
	25
	27
	sorted list using lambda expression
	10
	12
	15
	17
	20
	22
	25
	27
	Elements after sorting using customized sorting(comparator interface compare())
	27
	25
	22
	20
	17
	15
	12
	10
*/
		
