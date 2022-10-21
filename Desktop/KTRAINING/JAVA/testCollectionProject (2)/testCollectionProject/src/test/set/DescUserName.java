package test.set;

import java.util.Comparator;

public class DescUserName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof User && o2 instanceof User) {
			User b1 = (User)o1;
			User b2 = (User)o2;
			
			result = b1.getUsername().compareTo(b2.getUsername());
		}
		return -result;
	}

}
