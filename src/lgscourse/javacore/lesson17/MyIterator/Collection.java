package lgscourse.javacore.lesson17.MyIterator;

public class Collection {
	private static Number numberArray[];

	public Collection(Number[] numberArray) {
		Collection.numberArray = numberArray;
	}
	
	private class ForwardOrder implements Iterator{
		private int countOfElements = 0;
		
		@Override
		public boolean hasNext() {
			return countOfElements < numberArray.length;
		}

		@Override
		public Number next() {
			return numberArray[countOfElements++];
		}
	}
	
	public Iterator forwardOrderIterator(){
		return new ForwardOrder();
	}
	
	private class BackwardOrder implements Iterator{
		
		private int countOfElements = numberArray.length - 1;

		@Override
		public boolean hasNext() {
			return countOfElements >= 0;
		}

		@Override
		public Number next() {
			int index = countOfElements;
			countOfElements -= 2;
			return numberArray[index];
		}
	}
	
	public Iterator backwardOrderIterator(){
		return new BackwardOrder();
	}
	
	public Iterator anonymousIterator() {
		return new Iterator() {

			private int countOfElements = numberArray.length - 1;
			
			@Override
			public boolean hasNext() {
				return countOfElements >= 0;
			}

			@Override
			public Number next() {
				int index = countOfElements;
				countOfElements -= 3;
				return numberArray[index];
			}
		};
	}
	
	public Iterator localIterator() {
		class Local implements Iterator{

			private int countOfElements = 0;
			
			@Override
			public boolean hasNext() {
				return countOfElements < numberArray.length;
			}

			@Override
			public Number next() {
				int index = countOfElements;
				countOfElements += 5;
				return numberArray[index];
			}
			
		}
		return new Local();
	}
	
	private static class Static implements Iterator{
		
		private int countOfElements = 0;
		
		@Override
		public boolean hasNext() {
			return countOfElements < numberArray.length;
		}

		@Override
		public Object next() {
			int index = countOfElements;
			countOfElements += 2;
			return numberArray[index];
		}
	}
	
	public static Iterator staticIterator() {
		return new Static();
	}
}
