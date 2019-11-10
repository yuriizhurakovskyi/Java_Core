package lgscourse.javacore.lesson16.Reflection;

import java.io.Serializable;

public class Airplane extends Aircraft implements Serializable, Comparable<Airplane> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int emptyWeight;
	private int length;
	private int maxSpeed;
	public Airplane(String name, int emptyWeight, int size, int speed) {
		this(true, name, emptyWeight, size, speed); 
	}
	
	
	public Airplane(int emptyWeight, int size, int speed) {
		super(true);
		this.emptyWeight = emptyWeight;
		this.length = size;
		this.maxSpeed = speed;
		this.name = null;
	}
	
	public Airplane(int emptyWeight, int size) {
		super(true);
		this.emptyWeight = emptyWeight;
		this.length = size;
		this.maxSpeed = 0;
		this.name = null;
	}
	
	public Airplane() {
		super(true);
		this.emptyWeight = 19700;
		this.length = 19;
		this.maxSpeed = 2414;
		this.name = "Lockheed Martin F-22 Raptor";
	}
	private Airplane(boolean lighterORHeavierThanAir, String name, int emptyWeight, int size, int maxSpeed) {
		super(lighterORHeavierThanAir);
		this.name = name;
		this.emptyWeight = emptyWeight;
		this.length = size;
		this.maxSpeed = maxSpeed;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return emptyWeight;
	}
	public void setWeight(int weight) {
		this.emptyWeight = weight;
	}
	public int getSize() {
		return length;
	}
	public void setSize(int size) {
		this.length = size;
	}
	public int getSpeed() {
		return maxSpeed;
	}
	public void setSpeed(int speed) {
		this.maxSpeed = speed;
	}
	@Override
	public void fly() {
		System.out.println("Airplane flies");
	}
	
	@Override
	public int compareTo(Airplane o) {
		if(this.getName().compareTo(o.getName()) > 0 )
			return 1;
		else if(this.getName().compareTo(o.getName()) > 0)
			return -1;
		else if(this.getSpeed() > o.maxSpeed)
			return 1;
		else if(this.getSpeed() < o.maxSpeed)
			return -1;
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + length;
		result = prime * result + maxSpeed;
		result = prime * result + emptyWeight;
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
		Airplane other = (Airplane) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (length != other.length)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		if (emptyWeight != other.emptyWeight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Airplane [name=" + name + ", weight=" + emptyWeight + ", size=" + length + ", speed=" + maxSpeed + "]";
	}

}
