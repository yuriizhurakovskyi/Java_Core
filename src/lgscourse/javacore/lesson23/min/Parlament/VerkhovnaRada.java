package lgscourse.javacore.lesson23.min.Parlament;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class VerkhovnaRada {
	private static VerkhovnaRada instance;
	private ArrayList<ParliamentaryParty> parliamentaryParties;
	private int freePlaces;

	private VerkhovnaRada() {
		parliamentaryParties = new ArrayList<>();
		freePlaces = 450;
	}

	public static VerkhovnaRada getInstance() {
		if (instance == null) {
			instance = new VerkhovnaRada();
		}
		return instance;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	public void addParliamentaryParty(ParliamentaryParty parliamentaryParty) {
		if (instance.freePlaces != 0 && parliamentaryParty.getRepresentatives().size() <= instance.freePlaces) {
			instance.parliamentaryParties.add(parliamentaryParty);
			instance.freePlaces -= parliamentaryParty.getRepresentatives().size();
		} else
			System.out.println("Немає вільних місць");
	}

	public void removeParliamentaryParty(String parliamentaryParty) {
		if (instance != null) {
			instance.parliamentaryParties.removeIf(p -> p.getName().equalsIgnoreCase(parliamentaryParty));
		}
	}

	public void showAllParliamentaryParties() {
		System.out.println("\nФракції Верховної Ради: ");
		instance.parliamentaryParties.forEach(p -> {
			System.out.println(p.getName());
			p.getRepresentatives().stream().forEach(System.out::println);
		});
	}

	public void showAllParliamentaryPartyNames() {
		System.out.println("\nФракції Верховної Ради: ");
		instance.parliamentaryParties.forEach(p -> System.out.println(p.getName()));
	}

	public void showParliamentaryParty(String parliamentaryPartyName) {
		System.out
				.println(parliamentaryParties.stream().filter(p -> parliamentaryPartyName.equalsIgnoreCase(p.getName()))
						.findFirst().orElseThrow(NoSuchElementException::new).getRepresentatives());
	}

	public MP getRepresentativeIfExists(String firstName, String lastName, int age) {
		return instance.parliamentaryParties.stream()
				.filter(p -> p.getRepresentatives().stream()
						.filter(r -> r.getFirstName().equalsIgnoreCase(firstName.trim())
								&& r.getLastName().equalsIgnoreCase(lastName.trim()) && r.getAge() == age)
						.findFirst().isPresent())
				.findFirst().get().getRepresentatives().stream()
				.filter(r -> r.getFirstName().equalsIgnoreCase(firstName.trim()) && r.getLastName().equalsIgnoreCase(lastName.trim())
						&& r.getAge() == age)
				.findFirst().orElseThrow(NoSuchElementException::new);
	}

	public boolean isExists(String parliamentaryPartyName) {
		return instance.parliamentaryParties.stream().filter(p -> p.getName().equalsIgnoreCase(parliamentaryPartyName))
				.findFirst().isPresent();
	}

	public void addRepresentativeToParliamentaryParty(MP mp, String parliamentaryPartyName) {
		instance.parliamentaryParties.stream().filter(p -> p.getName().equalsIgnoreCase(parliamentaryPartyName))
				.findFirst().orElseThrow(NoSuchElementException::new).addRepresentative(mp);
	}

	public void deleteRepresentative(MP mp) {
		instance.parliamentaryParties.forEach(p -> {
			p.getRepresentatives().removeIf(r -> r == mp);
			instance.freePlaces--;
		});
	}

	public void showALLBriberied(String parliamentaryParty) {
		instance.parliamentaryParties.stream()
				.filter(p -> p.getName().equalsIgnoreCase(parliamentaryParty) && p.getALLBriberied() != null)
				.findFirst().orElseThrow(NoSuchElementException::new).getALLBriberied().forEach(System.out::println);
	}

	public void showTheMostBriberied(String parliamentaryParty) {
		instance.parliamentaryParties.stream().filter(p -> p.getName().equalsIgnoreCase(parliamentaryParty)).findFirst()
				.orElseThrow(NoSuchElementException::new).showTheMostBriberied();
	}

	public void clearParliamentaryParty(String parliamentaryParty) {
		instance.freePlaces -= instance.parliamentaryParties.stream()
				.filter(p -> p.getName().equalsIgnoreCase(parliamentaryParty)).findFirst()
				.orElseThrow(NoSuchElementException::new).getRepresentatives().size();
		instance.parliamentaryParties.stream().filter(p -> p.getName().equalsIgnoreCase(parliamentaryParty)).findFirst()
				.get().clearAllRepresentatives();

	}

}
