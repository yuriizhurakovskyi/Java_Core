package lgscourse.javacore.lesson23.min.Parlament;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class ParliamentaryParty implements Comparable<ParliamentaryParty> {
	private String name;
	private ArrayList<MP> representatives;

	public ParliamentaryParty(String name) {
		this.name = name;
		representatives = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<MP> getRepresentatives() {
		return representatives;
	}

	public void addRepresentative(MP mp) {
		representatives.add(mp);
	}

	public void removeRepresentative(MP mp) {
		representatives.remove(mp);
	}

	public ArrayList<MP> getALLBriberied() {
		ArrayList<MP> briberied = new ArrayList<>();
		representatives.forEach(m -> {
			if (m.isBriberied())
				briberied.add(m);
		});
		return briberied;
	}

	public void showTheMostBriberied() {
		System.out.println(getALLBriberied().stream().max(Comparator.comparing(MP::getBriberySize))
				.orElseThrow(NoSuchElementException::new));
	}

	public int getMaxBriberySize() {
		return getALLBriberied().stream().max(Comparator.comparing(MP::getBriberySize))
				.orElseThrow(NoSuchElementException::new).getBriberySize();
	}

	public void showAllRepresentatives() {
		System.out.println("Депутати фракції " + name + ": "
				+ representatives.stream().map(mp -> mp + "\n").collect(Collectors.toList()));
	}

	public static void showRepresentatives(ArrayList<MP> representatives) {
		System.out.println(representatives.stream().map(mp -> mp + "\n").collect(Collectors.toList()));
	}

	public void clearAllRepresentatives() {
		representatives.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((representatives == null) ? 0 : representatives.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParliamentaryParty other = (ParliamentaryParty) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (representatives == null) {
			if (other.representatives != null)
				return false;
		} else if (!representatives.equals(other.representatives))
			return false;
		return true;
	}

	@Override
	public int compareTo(ParliamentaryParty arg0) {
		if (arg0.getName().compareTo(arg0.getName()) > 0)
			return 1;
		if (arg0.getName().compareTo(arg0.getName()) < 0)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "Фракція [Назва фракції: " + name + ", Предстваники: \n         " + representatives + "]";
	}

}
