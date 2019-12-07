package lgscourse.javacore.lesson17.MyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ведіть кількість елементів");
		try {
			int count = Integer.parseInt(bufferedReader.readLine());
			
			System.out.println();
			
			Number numbers[] = new Number[count];
			
			for (int i = 0; i < count; i++) {
				System.out.println("number " + (i + 1) + ": ");
				numbers[i] = Integer.parseInt(bufferedReader.readLine());
			}
			
			System.out.println("\n Forward Order Iterator: ");
			
			Collection collection = new Collection(numbers);
			
			Iterator forwardIterator = collection.forwardOrderIterator();
			
			while(forwardIterator.hasNext()) {
				int number = (int) forwardIterator.next();
				if(number % 2 == 0 )
					System.out.println(number);
				else System.out.println(0);
			}
			
			System.out.println("\n Backward Order Iterator: ");
			
			Iterator backwardIterator = collection.backwardOrderIterator();
			
			while(backwardIterator.hasNext()) {
				System.out.println(backwardIterator.next());
			}
			
			System.out.println("\n Anonymous Iterator");
			
			Iterator anonymousIterator = collection.anonymousIterator();

			while(anonymousIterator.hasNext()) {
				int number = (int) anonymousIterator.next();
				if(number % 2 != 0 )
					System.out.println(number);
			}
			
			System.out.println("\n Local Iterator");
			
			Iterator localIterator = collection.localIterator();

			while(localIterator.hasNext()) {
				int number = (int) localIterator.next();
				if(number % 2 == 0 ) {
					number -= 100;
				}
				System.out.println(number);
			}
			
			System.out.println("\n Static Iterator");
			
			Iterator staticIterator = Collection.staticIterator();
			
			while(staticIterator.hasNext()) {
				int number = (int) staticIterator.next();
				if(number % 2 == 0 )
					++number;
				else System.out.println(number);
			}
			
			bufferedReader.close();
			
		} catch (NumberFormatException e1) {
			System.out.println("Не є цифрою: \n" + Arrays.toString(e1.getStackTrace()));
		} catch (IOException e1) {
			System.out.println(Arrays.toString(e1.getStackTrace()));
		}
	}

}
