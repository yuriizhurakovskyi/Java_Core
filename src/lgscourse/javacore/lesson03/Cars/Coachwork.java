package lgscourse.javacore.lesson03.Cars;

public class Coachwork {
	private String type;
	private int numberOfSeats;
	private int width;
	private int height;
	private int length;
	private int curbWeight; 
	private int fullWeight;
	private int minimalTrunkVolume;
	private int maximalTrunkVolume;
	
	public Coachwork() {
		this.type = "crossover";
		this.numberOfSeats = 5;
		this.width = 1831;
		this.height = 1694;
		this.length = 4519;
		this.curbWeight = 1645;
		this.fullWeight = 1945;
		this.minimalTrunkVolume = 320;
		this.maximalTrunkVolume = 397;
	}
	
	public Coachwork(String type, int numberOfSeats, int width, int height, int length, int curbWeight, int fullWeight,
			int minimalTrunkVolume, int maximalTrunkVolume) {
		this.type = type;
		this.numberOfSeats = numberOfSeats;
		this.width = width;
		this.height = height;
		this.length = length;
		this.curbWeight = curbWeight;
		this.fullWeight = fullWeight;
		this.minimalTrunkVolume = minimalTrunkVolume;
		this.maximalTrunkVolume = maximalTrunkVolume;
	}
	
	public void changeCoachworkParameters(int numberOfSeats, int width, int height, int length, int curbWeight, int fullWeight,
			int minimalTrunkVolume, int maximalTrunkVolume) {
		this.numberOfSeats = numberOfSeats;
		this.width = width;
		this.height = height;
		this.length = length;
		this.curbWeight = curbWeight;
		this.fullWeight = fullWeight;
		this.minimalTrunkVolume = minimalTrunkVolume;
		this.maximalTrunkVolume = maximalTrunkVolume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getCurbWeight() {
		return curbWeight;
	}

	public void setCurbWeight(int curbWeight) {
		this.curbWeight = curbWeight;
	}

	public int getFullWeight() {
		return fullWeight;
	}

	public void setFullWeight(int fullWeight) {
		this.fullWeight = fullWeight;
	}

	public int getMinimalTrunkVolume() {
		return minimalTrunkVolume;
	}

	public void setMinimalTrunkVolume(int minimalTrunkVolume) {
		this.minimalTrunkVolume = minimalTrunkVolume;
	}

	public int getMaximalTrunkVolume() {
		return maximalTrunkVolume;
	}

	public void setMaximalTrunkVolume(int maximalTrunkVolume) {
		this.maximalTrunkVolume = maximalTrunkVolume;
	}

	@Override
	public String toString() {
		return "Coachwork [Type :" + type + "; Number of seats : " + numberOfSeats + "; width : " + width + "; height : "
				+ height + "; Length : " + length + "; Curb weight : " + curbWeight + "; Full weight : " + fullWeight
				+ "; Minimal trunk volume : " + minimalTrunkVolume + "; Maximal trunk volume : " + maximalTrunkVolume + "]";
	}
	
	
	
}
