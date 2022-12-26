/**
*
*	8. Program to display group of elements using of() of stream
*
*
*/
import java.util.*;
import java.util.stream.*;

public class StreamProcessOf {

	public static void main(String[] args) {
	System.out.println("Elements of type Stream of homogeneous elements:");
	Stream strm = Stream.of(10,100,1000,10000,10000000);
	strm.forEach(System.out::println);
	
	System.out.println("Elements of type Stream of heterogeneous elements:");
	Stream strm1 = Stream.of(10,100.5,1000,10000,"10000000");
	strm1.forEach(System.out::println);
	
	System.out.println("Elements of type Integer Array:");
	Integer[] intArray = {1,12,123,1234,12345};
	Stream intStream = Stream.of(intArray);
	intStream.forEach(i->System.out.println(i));
	
	}
}

/***********************************************************************************************************************************/
/*							Output										*/
/*	Elements of type Stream of homogeneous elements:
10
100
1000
10000
10000000
Elements of type Stream of heterogeneous elements:
10
100.5
1000
10000
10000000
Elements of type Integer Array:
1
12
123
1234
12345
**********************************************************************************************************************************/
