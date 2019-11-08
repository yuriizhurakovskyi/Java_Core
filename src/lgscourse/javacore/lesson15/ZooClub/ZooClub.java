package lgscourse.javacore.lesson15.ZooClub;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZooClub {
	Map<Person, List<Pet>> map;

	public ZooClub() {
		map = new HashMap<>();
	}
	
	
	public Map<Person, List<Pet>> getMap() {
		return map;
	}


	public void addMemberZooClub(Person person) {
		if(map != null) {
			map.put(person, new LinkedList<Pet>());
		}
	}
	
	public void addPet(Person person, Pet pet) {
		if(map != null) {
			Set<Map.Entry<Person, List<Pet>>> set = map.entrySet();
			for (Map.Entry<Person, List<Pet>> entry : set) {
				if(entry.getKey() == person) {
					entry.getValue().add(pet);
				}
			}
		}
	}
	
	public void removePet(Person person, Pet pet) {
		if(map != null) {
			Set<Map.Entry<Person, List<Pet>>> set = map.entrySet();
			for (Map.Entry<Person, List<Pet>> entry : set) {
				if(entry.getKey() == person) {
					entry.getValue().remove(pet);
				}
			}
		}
	}
	
	public void deleteMemberZooClub(Person person) {
		if(map != null && person != null) {
			map.remove(person);
		}
	}
	
	public void removePet(Pet pet) {
		if(map != null && pet != null) {
			Set<Map.Entry<Person, List<Pet>>> set = map.entrySet();
			for (Map.Entry<Person, List<Pet>> entry : set) {
				entry.getValue().remove(pet);
			}
		}
	}
	
	public Person getPersonFromZooClub(String name, int age) {
		if(map != null) {
			Set<Map.Entry<Person, List<Pet>>> set = map.entrySet();
			for (Map.Entry<Person, List<Pet>> entry : set) {
				if(entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
					return entry.getKey();
				}
			}
			return null;
		}
		return null;
	}

	public Pet getPetFromZooClub(String animalType, String name) {
		if(map != null) {
			Set<Map.Entry<Person, List<Pet>>> set = map.entrySet();
			for (Map.Entry<Person, List<Pet>> entry : set) {
				for (Pet pet : entry.getValue()) {
					if(pet.animalType.name().equalsIgnoreCase(animalType)&& pet.getName().equalsIgnoreCase(name))
						return pet;
				}
			}
			return null;
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}
	
	
}
