package jp.co.methodologic.sec15refactoring;

public class Movie {

	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.setPriceCode(priceCode);
	}

	public String getTitle() {
		return this.title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public int getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public void setPriceCode(int priceCode) {
		switch(priceCode) {
		case Movie.REGULAR:
			this.price = new RegularPrice();
			break;
		case Movie.CHILDREN:
			this.price = new ChildrenPrice();
			break;
		case Movie.NEW_RELEASE:
			this.price = new NewReleasePrice();
			break;
		default:

		}
	}

}
