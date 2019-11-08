package lgscourse.javacore.lesson15.ZooClub;

public class Pet {
	AnimalType animalType;
	String name;
	public Pet(AnimalType animalType, String name) {
		this.animalType = animalType;
		this.name = name;
	}
	public AnimalType getAnimalType() {
		return animalType;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Animal [Type of animal=" + animalType + ", name=" + name + "]\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animalType == null) ? 0 : animalType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Pet other = (Pet) obj;
		if (animalType != other.animalType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
