package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
	List<CookieOrder> orders = new ArrayList<CookieOrder>();

	public void addOrder(CookieOrder cookieOrder) {
		orders.add(cookieOrder);
	}

	public int listSize() {
		return orders.size();
	}

	public int getTotalBoxes() {
		return orders.get(0).getNumBoxes();
	}

}
