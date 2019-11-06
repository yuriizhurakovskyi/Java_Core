package lgscourse.javacore.lesson14.Commodity;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity> {

	@Override
	public int compare(Commodity arg0, Commodity arg1) {
		if(arg0.getWeight() > arg1.getWeight())
			return 1;
		else if(arg0.getWeight() < arg1.getWeight())
			return -1;
		else if(arg0.getName().compareTo(arg1.getName()) > 0)
			return 1;
		else if(arg0.getName().compareTo(arg1.getName()) < 0)
			return -1;
		else if(arg0.getLength() > arg1.getLength())
			return 1;
		else if(arg0.getLength() < arg1.getLength())
			return -1;
		else if(arg0.getWidth() > arg1.getWidth())
			return 1;
		else if(arg0.getWidth() < arg1.getWidth())
			return -1;
		return 0;
	}

}
