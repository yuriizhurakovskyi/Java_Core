package lgscourse.javacore.lesson11.SortedIntegers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Integer[] array = new Integer[20];
		fillRandomIntegerArray(array);
		System.out.println("Array " + Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("DESC " + Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("ASC " + Arrays.toString(array));
	}
	
	public static void fillRandomIntegerArray(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(201)-100;					
		}
	}
}
