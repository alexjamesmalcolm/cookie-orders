package cookies;

import java.util.ArrayList;

public class MasterOrder {

	private ArrayList<______> orders = new ArrayList<>();

	public void addOrder(CookieOrder cookieOrder) {
		

	}

	public int listSize() {
		
	}

	public int getTotalBoxes() {
		int numBoxes = 0;

		for (_______ ____ : ______) {
			numBoxes += _____._____();
		}
		return numBoxes;
	}

	public void removeVariety(String variety) {
		for (int i = _____.____() - 1; i >= 0; i--) {
			if (_____.get(i).______().equals(_____)) {
				orders._____(i);
			}
		}

	}

}
