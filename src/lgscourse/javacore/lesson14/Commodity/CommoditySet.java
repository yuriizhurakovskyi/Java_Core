package lgscourse.javacore.lesson14.Commodity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class CommoditySet {
	Set<Commodity> set;

	public CommoditySet() {
		set = new HashSet<>();
	}

	public Set<Commodity> getSet() {
		return set;
	}
	
	@Override
	public String toString() {
		if(set.isEmpty()) return "\nCommodity Set is empty\n";
		return "\nCommoditySet [set=" + Arrays.toString(set.toArray()) + "]\n";
	}
	
	public void add(Commodity commodity) {
			set.add(commodity);
	}
	
	public void remove(String name) {
		if(!set.isEmpty()) {
			Iterator<Commodity> iter = set.iterator();
			while(iter.hasNext()) {
				Commodity next = iter.next();
				if(next.getName().equalsIgnoreCase(name))
					iter.remove();
			}
		}else System.out.println("Commodity Set is empty");
	}
	
	public void put(String beforeCommodityName, Commodity afterCommodity) {
		if(!set.isEmpty()) {
			LinkedHashSet<Commodity> lhs = new LinkedHashSet<>();
			Iterator<Commodity> iter = set.iterator();
			while(iter.hasNext()) {
				Commodity next = iter.next();
				if(!next.getName().equalsIgnoreCase(beforeCommodityName)) {
					lhs.add(next);
				}else lhs.add(afterCommodity);
			}
			set = lhs;
		}else System.out.println("Commodity Set is empty");
	}
	
	public void sortByName() {
		if(!set.isEmpty()) {
			TreeSet<Commodity> treeSet = new TreeSet<>();
			treeSet.addAll(set);
			set = treeSet;
		}else System.out.println("Commodity Set is empty");
	}
	
	public void sortByLength() {
		if(!set.isEmpty()) {
			TreeSet<Commodity> treeSet = new TreeSet<>(new CommodityLengthComparator());
			treeSet.addAll(set);
			set = treeSet;
		}else System.out.println("Commodity Set is empty");
	}
	
	public void sortByWidth() {
		if(!set.isEmpty()) {
			TreeSet<Commodity> treeSet = new TreeSet<>(new CommodityWidthComparator());
			treeSet.addAll(set);
			set = treeSet;
		}else System.out.println("Commodity Set is empty");
	}
	
	public void sortByWeight() {
		if(!set.isEmpty()) {
			TreeSet<Commodity> treeSet = new TreeSet<>(new CommodityWeightComparator());
			treeSet.addAll(set);
			set = treeSet;
		}else System.out.println("Commodity Set is empty");
	}
	
	public void showCommodity(int index) {
		if(!set.isEmpty()) {
			if(index <= set.size() && index >= 1) {
				Iterator<Commodity> iter = set.iterator();
				int count = 0;
				while(iter.hasNext()) {
					Commodity commodity = iter.next();
					++count;
					if(count == index) {
						System.out.println(commodity);
						break;
					}
				}
			}
		}else System.out.println("Commodity Set is empty");
	}
}
