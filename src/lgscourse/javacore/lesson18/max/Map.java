package lgscourse.javacore.lesson18.max;



import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Map<K, V>{
	private Set<MyEntry<K, V>> set;

	public Map() {
		set = new LinkedHashSet<MyEntry<K, V>>();
	}

	public void addElement(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
	}
	
	public void deleteByKey(K key) {
		if(set.size()!=0) {
			Iterator<MyEntry<K, V>> iter = set.iterator();
			while(iter.hasNext()) {
				MyEntry<K, V> entry = iter.next();
				if(entry.getKey().equals(key))
					iter.remove();
			}
		}else System.out.println("Map is empty");
	}
	
	public void deleteByValue(V value) {
		if(set.size()!=0) {
			Iterator<MyEntry<K, V>> iter = set.iterator();
			while(iter.hasNext()) {
				MyEntry<K, V> entry = iter.next();
				if(entry.getValue().equals(value))
					iter.remove();
			}
		}else System.out.println("Map is empty");
	}
	
	public void showKeys() {
		if(set.size()!=0) {
			System.out.println("Keys: ");
			for (MyEntry<K, V> myEntry : set) {
				System.out.println(myEntry.getKey());
			}
		}else System.out.println("Map is empty");
		System.out.println();
	}
	
	public void showValues() {
		if(set.size()!=0) {
			System.out.println("Values: ");
			for (MyEntry<K, V> myEntry : set) {
				System.out.println(myEntry.getValue());
			}
			System.out.println();
		}else System.out.println("Map is empty");
	}
	
	public void show() {
		if(set.size()!=0) {
			for (MyEntry<K, V> myEntry : set) {
				System.out.println("Key: " + myEntry.getKey() + " Value: " + myEntry.getValue());
			}
		}else System.out.println("Map is empty");
		System.out.println();
	}

	@Override
	public String toString() {
		return "MyMap [set=" + set + "]\n";
	}
	
}
