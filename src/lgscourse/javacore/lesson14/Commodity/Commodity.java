package lgscourse.javacore.lesson14.Commodity;

public class Commodity implements Comparable<Commodity> {
	private String name;
	private double length;
	private double width;
	private double weight;
	
	public Commodity(String name, double length, double width, double weight) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getWeight() {
		return weight;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Commodity other = (Commodity) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + String.format("%.1f", length) + ", width=" + String.format("%.1f",width) + ", weight=" + String.format("%.3"
				+ "f",weight) + "]\n";
	}

	@Override
	public int compareTo(Commodity o) {
		if(this.getName().compareTo(o.getName()) > 0)
			return 1;
		else if(this.getName().compareTo(o.getName()) < 0)
			return -1;
		else if(this.getLength() > o.getLength())
			return 1;
		else if(this.getLength() < o.getLength())
			return -1;
		else if(this.getWidth() > o.getWidth())
			return 1;
		else if(this.getWidth() < o.getWidth())
			return -1;
		else if(this.getWeight() > o.getWeight())
			return 1;
		else if(this.getWeight() < o.getWeight())
			return -1;
		return 0;
	}
	
	
}
