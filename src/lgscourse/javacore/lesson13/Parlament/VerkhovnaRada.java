package lgscourse.javacore.lesson13.Parlament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class VerkhovnaRada {
	private static VerkhovnaRada instance;
	private ArrayList<ParliamentaryParty> parliamentaryParties;
	private int freePlaces = 450;
	private VerkhovnaRada() {
		parliamentaryParties = new ArrayList<>();
	}
	public static VerkhovnaRada getInstance() {
		if(instance == null) {
			instance = new VerkhovnaRada();
		}
		return instance;
	}
	
	public int getFreePlaces() {
		return freePlaces;
	}

	
	public void addParliamentaryParty(ParliamentaryParty parliamentaryParty) {
		if(instance != null) {
			if(instance.freePlaces != 0 && parliamentaryParty.getRepresentatives().size() <= 450) {
				instance.parliamentaryParties.add(parliamentaryParty);
				instance.freePlaces -= parliamentaryParty.getRepresentatives().size();
			}
			else System.out.println("Немає вільних місць");
		}
	}
	
	public void removeParliamentaryParty(String parliamentaryParty) {
		if(instance != null) {
			Iterator<ParliamentaryParty> iterator = instance.parliamentaryParties.iterator();
			boolean found = false;
			while(iterator.hasNext()) {
				ParliamentaryParty pP = iterator.next();
				if(pP.getName().equalsIgnoreCase(parliamentaryParty)) {
					found = true;
					iterator.remove();
					instance.freePlaces += pP.getRepresentatives().size();
					break;
				}
			}
			if(!found) {
				System.out.println("Такої партії немає у Верховній Раді");
			}
		}
	}
	
	public void showAllParliamentaryParties() {
		if(instance != null) {
			System.out.println("\nФракції Верховної Ради: ");
			Iterator<ParliamentaryParty> iterator = instance.parliamentaryParties.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
	
	public void showAllParliamentaryPartyNames() {
		if(instance != null) {
			System.out.println("\nФракції Верховної Ради: ");
			Iterator<ParliamentaryParty> iterator = instance.parliamentaryParties.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getName());
			}
		}
	}
	
	public void showParliamentaryParty(String parliamentaryPartyName) {
		if(instance != null) {
			Iterator<ParliamentaryParty> iterator = instance.parliamentaryParties.iterator();
			while(iterator.hasNext()) {
				ParliamentaryParty parliamentaryParty = iterator.next();
				if(parliamentaryParty.getName().equalsIgnoreCase(parliamentaryPartyName))
					System.out.println(parliamentaryParty);
			}
		}
	}
	
	public void showParliamentaryParty(int parliamentaryPartyIndex) {
		if(instance != null) {
			System.out.println(instance.parliamentaryParties.get(parliamentaryPartyIndex));
		}
	}
	public MP getRepresentativeIfExists(String firstName, String lastName, int age) {
		if(instance != null) {
			for (int i = 0; i < instance.parliamentaryParties.size(); i++) {
				for (int j = 0; j < instance.parliamentaryParties.get(i).getRepresentatives().size(); j++) {
					if(instance.parliamentaryParties.get(i).getRepresentatives().get(j).getFirstName().equalsIgnoreCase(firstName)
							&& instance.parliamentaryParties.get(i).getRepresentatives().get(j).getLastName().equalsIgnoreCase(lastName)
							&& instance.parliamentaryParties.get(i).getRepresentatives().get(j).getAge() == age)
						return instance.parliamentaryParties.get(i).getRepresentatives().get(j);
				}
			}
		}
		return null;
	}
	
	public boolean isExists(String parliamentaryPartyName) {
		if(instance != null) {
			for (int i = 0; i < instance.parliamentaryParties.size(); i++) {
				if(instance.parliamentaryParties.get(i).getName().equalsIgnoreCase(parliamentaryPartyName)) {
					return true;
				}
			}
		}
		System.out.println("Такої фракції немає");
		return false;
	}
	
	public void addRepresentativeToParliamentaryParty(MP mp, String parliamentaryPartyName) {
		if(instance != null) {
			boolean found = false;
			for (int i = 0; i < instance.parliamentaryParties.size(); i++) {
				if(instance.parliamentaryParties.get(i).getName().equalsIgnoreCase(parliamentaryPartyName)) {
					found = true;
					instance.parliamentaryParties.get(i).addRepresentative(mp);
					instance.freePlaces--;
					break;
				}
			}
			if(!found)
				System.out.println("Такої фракції у Верховній раді немає");
		}
	}
	
	public void deleteRepresentative(MP mp) {
		if(instance != null) {
			ListIterator<ParliamentaryParty> iterator = instance.parliamentaryParties.listIterator();
			boolean found = false;
			while(iterator.hasNext()) {
				ListIterator<MP> iterator2 = iterator.next().getRepresentatives().listIterator();
				while(iterator2.hasNext()) {
					if(iterator2.next()==mp) {
						iterator2.remove();
						instance.freePlaces--;
						found = true;
						break;
					}
				}
				if(found) break;
			}
		}
	}
	
	public void showALLBriberied(String parliamentaryParty) {
		if(instance != null) {
			for (ParliamentaryParty parliamentaryParty2 : instance.parliamentaryParties) {
				if(parliamentaryParty2.getName().equalsIgnoreCase(parliamentaryParty) 
						&& parliamentaryParty2.getALLBriberied()!=null) {
					System.out.println("Всі хабарники фракції " + parliamentaryParty2.getName());
					System.out.println(Arrays.deepToString(parliamentaryParty2.getALLBriberied().toArray()));
					break;
				}else System.out.println("В цій фракції нема хабарників");
			}
		}
	}
	
	public void showTheMostBriberied(String parliamentaryParty) {
		if(instance != null) {
			ArrayList<ParliamentaryParty> parlParties = instance.parliamentaryParties;
			for (ParliamentaryParty parliamentaryParty2 : parlParties) {
				if(parliamentaryParty2.getName().equalsIgnoreCase(parliamentaryParty)) {
					parliamentaryParty2.showTheMostBriberied();
					break;
				}
			}
		}
	}
	
	public void clearParliamentaryParty(String parliamentaryParty) {
		if(instance != null) {
			ArrayList<ParliamentaryParty> parlParties = instance.parliamentaryParties;
			for (ParliamentaryParty parliamentaryParty2 : parlParties) {
				if(parliamentaryParty2.getName().equalsIgnoreCase(parliamentaryParty)) {
					int size =parliamentaryParty2.getRepresentatives().size();
					parliamentaryParty2.clearAllRepresentatives();
					instance.freePlaces -= size;
					break;
				}
			}
		}
	}
	
}
