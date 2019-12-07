package lgscourse.javacore.lesson13.Parlament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ParliamentaryParty {
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
		Iterator<MP> iterator = representatives.iterator();
		boolean found = false;
		while(iterator.hasNext()) {
			MP mp = iterator.next();
			if(mp.isBriberied())
			{
				found = true;
				briberied.add(mp);
			}
		}
		if(found)
			return briberied;
		return null;
	}
	
	public void showTheMostBriberied() {
			ArrayList<MP> briberied = getALLBriberied();
			if(briberied!=null) {
				int maxBriberySize = briberied.get(0).getBriberySize();
				for (int i = 1; i < briberied.size(); i++) {
					if(maxBriberySize < briberied.get(i).getBriberySize())
						maxBriberySize = briberied.get(i).getBriberySize();
				}
				System.out.println("��������� ��������(�): ");
				for (MP mp : briberied) {
					if(mp.getBriberySize() == maxBriberySize) {
						System.out.println(mp);
					}
				}
			}else
				System.out.println("� ��� ������� ���� ���������");
	}
	
	public void showAllRepresentatives() {
		if(representatives.size()!=0) {
			System.out.println("�������� ������� " + name + ": ");
			System.out.println(Arrays.deepToString(representatives.toArray()));
		}else System.out.println("� ������� ���� ��������");
	}
	
	public static void showRepresentatives(ArrayList<MP> representatives) {
		if(representatives.size()!=0) {
			System.out.println(Arrays.deepToString(representatives.toArray()));
		}
	}
	
	public void clearAllRepresentatives() {
		representatives.clear();
	}
	@Override
	public String toString() {
		return "������� [����� �������: " + name + ", ������������: \n         " + representatives + "]";
	}
	
	
	
}
