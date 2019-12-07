package lgscourse.javacore.lesson23.max.Commodity;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.Set;

public class CommoditySet {
	Set<Commodity> set;

	public CommoditySet() {
		set = new TreeSet<>();
	}

	public Set<Commodity> getSet() {
		return set;
	}

	@Override
	public String toString() {
		if (set.isEmpty())
			return "\nCommodity Set is empty\n";
		return "\nCommoditySet [set=" + Arrays.toString(set.toArray()) + "]\n";
	}

	public void add(Commodity commodity) {
		set.add(commodity);
	}

	public void remove(String name) {
		if (!set.isEmpty()) {
			set.removeIf(c -> c.getName().equalsIgnoreCase(name));
		} else
			System.out.println("Commodity Set is empty");
	}

	public void put(String beforeCommodityName, Commodity afterCommodity) {
		if (!set.isEmpty()) {
			LinkedHashSet<Commodity> lhs = new LinkedHashSet<>();
			Iterator<Commodity> iter = set.iterator();
			while (iter.hasNext()) {
				Commodity next = iter.next();
				if (!next.getName().equalsIgnoreCase(beforeCommodityName)) {
					lhs.add(next);
				} else
					lhs.add(afterCommodity);
			}
			set = lhs;
		} else
			System.out.println("Commodity Set is empty");
	}

	public void sortByName() {
		if (!set.isEmpty()) {
			set = set.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
		} else
			System.out.println("Commodity Set is empty");
	}

	public void sortByLength() {
		if (!set.isEmpty()) {
			set = set.stream().sorted((c1, c2) -> (int) ((c1.getLength() - c2.getLength()) * 1000))
					.collect(Collectors.toCollection(LinkedHashSet::new));
		} else
			System.out.println("Commodity Set is empty");
	}

	public void sortByWidth() {
		if (!set.isEmpty()) {
			set = set.stream().sorted((c1, c2) -> (int) ((c1.getWidth() - c2.getWidth()) * 1000))
					.collect(Collectors.toCollection(LinkedHashSet::new));
		} else
			System.out.println("Commodity Set is empty");
	}

	public void sortByWeight() {
		if (!set.isEmpty()) {
			set = set.stream().sorted((c1, c2) -> (int) ((c1.getWeight() - c2.getWeight()) * 1000))
					.collect(Collectors.toCollection(LinkedHashSet::new));
		} else
			System.out.println("Commodity Set is empty");
	}

	public void showCommodity(int index) {
		if (!set.isEmpty()) {
			if (index <= set.size() && index >= 1) {
				Iterator<Commodity> iter = set.iterator();
				int count = 0;
				while (iter.hasNext()) {
					Commodity commodity = iter.next();
					++count;
					if (count == index) {
						System.out.println(commodity);
						break;
					}
				}
			}
		} else
			System.out.println("Commodity Set is empty");
	}
}
