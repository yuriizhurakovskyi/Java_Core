package lgscourse.javacore.lesson12.SortedIntegers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		fillRandomIntegerArray(array);
		System.out.println("Array " + Arrays.toString(array.toArray()));
		array.sort(Collections.reverseOrder());
		System.out.println("DESC " + Arrays.toString(array.toArray()));
		array.sort(null);;
		System.out.println("ASC " + Arrays.toString(array.toArray()));
	}
	
	public static void fillRandomIntegerArray(ArrayList<Integer> array ) {
		for (int i = 0; i < 20; i++) {
			array.add(new Random().nextInt(201)-100);
		}
	}
}
