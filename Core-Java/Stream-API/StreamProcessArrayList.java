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
