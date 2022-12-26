/**
*	Program to check weather numbers present in the list is even or not.
*	1. checkForEvenNumber(ArrayList<Integer> arrayList):void
*		a) This is a traditonal method which checks weather number present in the list is even number or not
*	2. checkForEvenNumberUsingStreams(ArrayList<Integer> arrayList):void
		a) This method uses stream() method which is available in Collection interface JDK 1.8V onwards
			a) Reduces number of lines of code
			b) step-1: collectionObject.stream() referes to configuration phase
			c) step-2: filter(java.util.function.Predicate<? super T>) - processing phase - processes the individula objects 					present in the Collection(in this example ArrayList<Integer> is used)
				a)filter() - filters or removes the element based on the logic present inside the filter method
					a) Accepts Predicate means internally we are implementing a body for the test(T) method present in 						the Predicate interface
			d) collect(java.util.stream.Collector<? super T, A, R>) - 
				collect(Collectors.toList())-returs List
					a) Collectors is a final Class - this is a utility class where we cannot inherit this class
					b) toList() is a static method and Returns a Collector that accumulates the input elements into a 								new List
								
	Note:
		Type Parameters:
		T - the type of the input elements
		K - the type of the keys
		A - the intermediate accumulation type of the downstream collector
		D - the result type of the downstream reduction
		M - the type of the resulting Map
		U - the type of the mapped values
		
		Parameters:
			classifier - a classifier function mapping input elements to keys
			downstream - a Collector implementing the downstream reduction
			mapFactory - a function which, when called, produces a new empty Map of the desired type
			
	what is downstream ?
	The term downstream in the documentation refers to one Collector accepting a second Collector as an argument. The argument is 		applied downstream (after) the Collector that accepts it. In other words, the downstream Collector is applied to the result of 		the upstream Collector.
	
	example:
		List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");
		List<Integer> res = list.stream().collect(Collectors.mapping(s -> s.length(), Collectors.toList()));
		
        In the above example Collectors.mapping() is upstream and Collectors.toList() is downstream as this shows Collectors.toList() is another collector which is applied on the result of Collectors.mapping hence Collectors.toList() is called as downstream.						
*
*
*/



import java.util.*;
import java.util.stream.*;

public class StreamProcessArrayList {


public static void checkForEvenNumber(ArrayList<Integer> arrayList) {
	System.out.println("Even Numbers in the ArrayList in Traditional way:");
	for(Integer integer : arrayList) {
		if (integer%2 == 0 ) {
			System.out.println(integer);
		}
	}
}

public static void checkForEvenNumberUsingStreams(ArrayList<Integer> arrayList){
	System.out.println("Even Numbers in the ArrayList using Stream:");
	List<Integer> list = arrayList.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
	list.forEach(System.out::println);
}

public static void main(String [] args) {
	ArrayList<Integer> arrayList = new ArrayList<>();
	arrayList.add(10);
	arrayList.add(30);
	arrayList.add(22);
	arrayList.add(11);
	arrayList.add(1);
	arrayList.add(32);
	arrayList.add(15);
	arrayList.add(17);
	
	checkForEvenNumber(arrayList);
	checkForEvenNumberUsingStreams(arrayList);

	}
}


/**************************************************************************************************************************************/
/* Output: 
	Even Numbers in the ArrayList in Traditional way:
	10
	30
	22
	32
	Even Numbers in the ArrayList using Stream:
	10
	30
	22
	32
*/
/* *************************************************************************************************************************************/
/*							Observation on Errors
/* 1. StreamProcessArrayList.java:48: error: class, interface, or enum expected
Public class StreamProcessArrayList {
^
1 error
solution:
	make Public to public as java is case-sensitive.

2. StreamProcessArrayList.java:53: error: incompatible types: Object cannot be converted to Integer
	for(Integer integer : arrayList) {
solution:
	method signature was public static void checkForEvenNumber(ArrayList arrayList) here ArrayList without specific generic type hence while
	processing the data inside for loop it accepts Object type not a specific type hence either change the enhanced for loop as 
	for(Object obj : arrayList) 
						or 
	if you are sure and know there is only Integer objects present inside ArrayList then modify the Argument ArrayList<Integer> then method signature is as shown: checkForEvenNumber(ArrayList<Integer> arrayList).
	
3. StreamProcessArrayList.java:62: error: bad operand types for binary operator '%'
	List<Integer> list = arrayList.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
	                                                                 ^
  first type:  Object
  second type: int

Solution:
	as mod (%) is binary operator checks both the operands Data type here one is int-primitive this shows it considers in case of numeric types by default it as int and other is Object as per the method signature -checkForEvenNumberUsingStreams(ArrayList arrayList)
	specify the generic type object handled by ArrayList which is a argument then the  method signature is as shown: checkForEvenNumberUsingStreams(ArrayList<Integer> arrayList)
	
4. StreamProcessArrayList.java:62: error: incompatible types: Object cannot be converted to List<Integer>
	List<Integer> list = arrayList.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
Solution:
	return type is List and we are collecting it in List<Integer> list as Collectors.toList() returs List of objects where type is Objects because of Argument (ArrayList arraylist), when we modify the Argument like this checkForEvenNumberUsingStreams(ArrayList<Integer> arrayList). Then there will be no error as Both types are matching.
	or
List<Integer> here we have create List list then also error will be resolved.
****************************************************************************************************************************************/
