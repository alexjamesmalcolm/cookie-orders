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
		return orders.stream().mapToInt(order -> order.getNumBoxes()).sum();
	}

	public void removeVariety(String variety) {
		orders.removeIf(order -> order.getVariety().equals(variety));
	}

	public void showOrder() {
		orders.forEach(order -> {
			System.out.println("Variety: " + order.getVariety() + ", Boxes: " + order.getNumBoxes());
		});
	}

}
