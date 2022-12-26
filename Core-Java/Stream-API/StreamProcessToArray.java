/**
*
*	7. Program to convert ArrayList to Array using toArray() of stream API
*
**/
import java.util.*;
import java.util.stream.*;

public class StreamProcessToArray {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		
		
			doubleList.add(10.5);
			doubleList.add(100.5);
			doubleList.add(11.5);
			doubleList.add(21.5);
			doubleList.add(30.5);
			doubleList.add(40.5);
			
			arrayList.add(27);
			arrayList.add(10);
			arrayList.add(25);
			arrayList.add(12);
			arrayList.add(22);
			arrayList.add(15);
			arrayList.add(20);
			arrayList.add(17);
		
		convertToArray(arrayList);
		convertDoubleToArray(doubleList);
		convertObjectToArray();
	}
	public static void convertToArray(ArrayList<Integer> arrayList) {
		Integer [] array = arrayList.stream().toArray(Integer[]::new); // constructor reference
		System.out.println("Elements present in the Array:");
		for(Integer element : array) {
			System.out.println(element);
		}
	}
	public static void convertDoubleToArray(ArrayList<Double> doubleList) {	 
		Double [] dArray = doubleList.stream().toArray(Double [] :: new);
		System.out.println("Elements present in the Double Array:");
		for(Double elem : dArray) {
			System.out.println(elem);
		} 
		}
		
	public static void convertObjectToArray() {
		ArrayList objList = new ArrayList();
		objList.add("Xyz");
		objList.add(10);	 
		Object [] objArray = objList.stream().toArray(); // here we can see Object array is capable of storing heterogeneous 										elements in it
		System.out.println("Elements present in the Object Array:");
		for(Object elem : objArray) {
			System.out.println(elem);
		} 
	}
}

/***********************************************************************************************************************************/
/*							Output										*/
/*
	Elements present in the Array:
	27
	10
	25
	12
	22
	15
	20
	17
	Elements present in the Double Array:
	10.5
	100.5
	11.5
	21.5
	30.5
	40.5
	Elements present in the Object Array:
	Xyz
	10

************************************************************************************************************************************/
