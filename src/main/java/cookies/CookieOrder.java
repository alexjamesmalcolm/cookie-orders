package cookies;

public class CookieOrder {

	private String variety;
	private int numBoxes;

	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}

	public CookieOrder(String variety, int numBoxes) {
		this.numBoxes = numBoxes;
		this.variety = variety;
	}

	public CookieOrder() {
		// TODO Auto-generated constructor stub
	}

}
