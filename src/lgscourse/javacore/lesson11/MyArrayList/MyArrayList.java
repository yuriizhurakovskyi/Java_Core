package lgscourse.javacore.lesson11.MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
	private final int SIZE = 20;
	private Object[] array = new Object[SIZE];
	private int sP = 0;
	
	public void add(T item) {
		if(sP == array.length - 1) {
			Object[] array2 = new Object[array.length * 2];
			 System.arraycopy(array, 0, array2, 0, sP);
		      array = array2;
		}
		array[sP++] = item;
	}
	
	public boolean remove(int index) {
		if(index >= sP)
			return false;
		 for (int i = index; i< sP; i++) 
			 array[i] = array[i+1];
		 array[sP] = null;
		 sP--;
		 if(array.length > SIZE && sP < SIZE)
		 {
			 Object[] array3 = new Object[array.length / 2];
			 System.arraycopy(array, 0, array3, 0, sP);
		 }
		 return true;
	}
	
	public int size() {
		return sP;
	}
	
	@Override
	public String toString() {
		String result = "[";
		for (int i = 0; i < sP; i++) {
			result+=(" " + array[i]);
			if(i!=(sP-1)) {
				result+=",";
			}
		}
		result+=" ]";
		return result;
	}
}
