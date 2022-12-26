/**
*3.Program to count the length of the string which is greater than 5
*
*/

import java.util.*;
import java.util.stream.*;

public class StreamProcessAlCount {
	public static void countObjectsBasedOnLength(ArrayList<String> names) {
	System.out.println("count based on the toList() method and display count using list.size()");
	List<String> nameList = names.stream().filter(name->name.length()>5).collect(Collectors.toList());
	System.out.println(nameList.size());
	
	System.out.println("count based on the count method present in the stream API");
	long count = names.stream().filter(name->name.length()>5).count();
	System.out.println(count);
	
	}


	public static void main(String [] args) {
		ArrayList<String>names = new ArrayList<String>();
		names.add("sachin");
		names.add("saurav");
		names.add("dhoni");
		names.add("dravid");
		names.add("kohli");
		names.add("raina");
		
		System.out.println("Elements present in the ArrayList with its length:");
		Iterator<String> iterator = names.iterator();
		String element = new String();
		while(iterator.hasNext()) {
			element = iterator.next();
			System.out.println(element + ": length :"+element.length());
		}
		countObjectsBasedOnLength(names);
	}

}

